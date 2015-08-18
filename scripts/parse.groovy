String json = new File(args[0]).text
Data data = Serializer.parse(json, Data)
println data.payload
return

def document = new XmlSlurper().parseText(data.payload)
println groovy.xml.XmlUtil.serialize(document)

document.AnnotationSet.Annotation.findAll { it.'@Type' == 'Token' }.each { token ->
	token.Feature.find { f -> f.Name.text() == 'string' }.each { feature ->
		println feature.Value.text()
	}
}
