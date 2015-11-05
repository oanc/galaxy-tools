#!/bin/bash
set -e

echo "Generating test-data/tokenizer-expected.lif"
lsd invoke.lsd stanford.tokenizer_2.0.0 test-data/hello_world.txt test-data/tokenizer-expected.lif

echo "Generating test-data/splitter-expected.lif"
lsd invoke.lsd stanford.splitter_2.0.0 test-data/tokenizer-expected.lif test-data/splitter-expected.lif

echo "Generating test-data/tagger-expected.lif"
lsd invoke.lsd stanford.tagger_2.0.0 test-data/splitter-expected.lif test-data/tagger-expected.lif

echo "Generating test-data/ner-expected.lif"
lsd invoke.lsd stanford.ner_2.0.0 test-data/tagger-expected.lif test-data/ner-expected.lif
