help:
	@echo "GOALS"
	@echo "wrappers - Generate the Galaxy tool XML wrappers"
	@echo "script   - Generates the bash script that generates the test-data"
	@echo "data     - Runs the test-data.sh script to generate data for Planemo tests."
	@echo "lint     - Runs planemo shed_lint"
	@echo "test     - Runs the planemo tests."
	@echo
	
wrappers:
	groovy ../scripts/GenerateWrappers.groovy -x . -f $(FORMAT) -id $(GENERATOR) -i services.conf -c citation.bib
	
script:
	groovy ../scripts/GenerateWrappers.groovy -b . -i services.conf -id $(GENERATOR) -f $(FORMAT)
	chmod u+x test-data.sh
	
data:
	./test-data.sh
	
lint:
	planemo shed_lint --xsd --ensure_metadata --tools

test:
	planemo test

	
