/*
 * This Groovy script generates the Galaxy tool wrappers (XML files) and a bash script
 * that can be called to generate the test data used in the <test> section of the 
 * wrappers.
 *
 * Run `groovy GenerateWrappers.groovy --help` for usage information (or read the code).
 */
 
import groovy.xml.MarkupBuilder
@GrabResolver(name='anc.org', root='http://www.anc.org:8080/nexus')
@Grab('org.anc.json:compiler:1.2.0')
import org.anc.json.compiler.*
@Grab('org.lappsgrid:serialization:2.0.1')
import org.lappsgrid.serialization.Serializer

/**
 * @author Keith Suderman
 */
class GenerateWrappers {
	
    File xmlDirectory
    File bashDirectory
    File input
	boolean generateXml = false
	boolean generateBash = false

	// Default method of generating id values if none is provided.	
    Closure idGenerator = { name -> name }
    String format
    String citation

	/**
	 * Generates a bash script that will pull in the files used in the <test> 
	 * sections of the XML files.
	 */
    void writeLsdScript(Map services) {
    	File script = new File(bashDirectory, "test-data.sh")
    	script.withWriter { writer ->
    		writer.println "#!/bin/bash"
    		writer.println "set -e"
			services.each { name,service ->
				String id = idGenerator(name)
				String output = "test-data/${name}-expected.${format}"
	    		writer.println()
				writer.println "echo \"Generating $output\""
				writer.println "lsd invoke.lsd ${id} test-data/${service.input} ${output}"
			}
		}
		println "Wrote ${script.path}"
    }

	/**
	 * Generates the tool XML file for a single service.
	 */
    void writeXml(String name, def service) {

        String id = idGenerator(name)
        File outfile = new File(xmlDirectory, "${id}.xml")
        IndentPrinter printer = new IndentPrinter(new FileWriter(outfile), '    ')
        MarkupBuilder xml = new MarkupBuilder(printer)
        xml.tool(id:id, name:service.name, version:'2.0.0') {
            description service.description
            requirements {
                requirement(type:'package',version:'2.2.1', 'lsdsl')
            }
            command(interpreter:'lsd', "invoke.lsd $id \$input \$output \$username \$password")
            inputs {
                param(name:'input', type:'data', label:'input', format:service.format)
                param(name:'username', type:'text', label:'Username', value:'tester')
                param(name:'password', type:'text', label:'Password', value:'tester')
            }
            outputs {
                data(name:'output', format:format)
            }
            tests {
                test {
                    param(name:'input', value: service.input)
                    param(name:'username', value: 'tester')
                    param(name:'password', value:'tester')
                    output(name:'output', file:service.output, ftype:format)
                }
            }
            help service.help
            if (citation != null) {
            	citations {
		            citation(type:'bibtex', citation)
		        }
	        }
        }
        println "Wrote ${outfile.path}"
        //println xml.toString()
    }

    void run() {
        SchemaCompiler compiler = new SchemaCompiler()
        String json = compiler.compile(input)
        Map services = Serializer.parse(json, Map)
        if (generateBash) {
	        writeLsdScript(services)
	    }
	    if (generateXml) {
			services.each { name,service ->
				if (!service.output) {
					service.output = "${name}-expected.${format}"
				}
				if (!service.help) {
					service.help = service.description
				}
				if (!service.format) {
					service.format = 'gate'
				}
				writeXml(name, service)
			}
		}
    }

    public static void main(args) {
        CliBuilder cli = new CliBuilder()
        cli.header = "Generates the tool XML files for Galaxy."
        cli.usage = "groovy GenerateWrappers.groovy [-x <directory>] [-l]"
        cli.h(longOpt:'help', required:false, 'Displays this help message.')
        cli.v(longOpt:'version', required:false, 'Prints the application version number.')
        cli.i(longOpt:'input', required: false, args:1, 'Tools description file in simplified Json')
        cli.id(longOpt:'identifier', required:false, args:1, 'Closure definition used to generate service id values.')
        cli.x(longOpt:'xml', required: false, args:1, 'Generates tool xml files to the specified directory.')
        cli.b(longOpt:'bash', required:false, args:1, 'Prints the bash commands required to generate the test data files.')
        cli.c(longOpt:'citation', required:false, args:1, "Citation (if any) to be included in the Tool xml files.")
        cli.f(longOpt:'format', required: false, args:1, "Data format produces by the tools.")
        //cli.o(longOpt:'output', required:false, args:1, "Directory where output files will be written.")
		cli.footer = "If a citation is specified it will be included in all tool XML files."
		
        def params = cli.parse(args)
        if (!params) return
        
        if (params.h) {
            cli.usage()
            return
        }

        if (params.v) {
            println """
LAPP Galaxy Tool Generator
Copyright 2015 Language Application Grid
Version 1.0.0
"""
            return
        }

        if (!params.i) {
            println "ERROR: No input file specified."
            cli.usage()
            return
        }
        if (!params.f) {
            println "ERROR: No output format specified."
            cli.usage()
            return
        }

        GenerateWrappers app = new GenerateWrappers()

        if (params.c) {
            File citation = new File(params.c)
            if (!citation.exists()) {
                println "Unable to find the citation file."
                return
            }
            app.citation = citation.text
        }
        /*
        if (params.b) {
            app.directory = new File(params.o)
            if (!app.directory.exists()) {
                println "ERROR: Output directory not found."
                return
            }
            if (!app.directory.isDirectory()) {
                println "ERROR: Specified output location is not a directory."
                return
            }
        }
        */
        if (params.x) {
        	app.xmlDirectory = new File(params.x)
        	if (!app.xmlDirectory.exists()) {
        		println "ERROR: XML output directory not found."
        		return
        	}
        	app.generateXml = true
        }
        if (params.b) {
        	app.bashDirectory = new File(params.b)
        	if (!app.bashDirectory.exists()) {
        		println "ERROR: Bash output directory not found."
        		return
        	}
        	app.generateBash = true
        }
        if (!app.generateXml && !app.generateBash) {
        	println "ERROR: No output mode specified."
        	cli.usage()
        	return
        }
        if (params.id) {
        	println "Parsing: ${params.id}"
        	app.idGenerator = new GroovyShell().evaluate(params.id)
        }
        
        app.format = params.f
        app.input = new File(params.i)
        if (!app.input.exists()) {
            println "ERROR: Input file not found."
            return
        }

        app.run()
    }
}
