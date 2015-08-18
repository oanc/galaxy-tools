String json = new File(args[0]).text

println groovy.json.JsonOutput.prettyPrint(json)
