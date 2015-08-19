
from galaxy.datatypes.text import Json
from galaxy.datatypes.data import Text
from galaxy.datatypes.data import get_file_peek
from galaxy.datatypes.data import nice_size
from galaxy.datatypes.metadata import MetadataElement
from galaxy import util

import tempfile
import subprocess
import json
import gzip
import os
import re

import logging

log = logging.getLogger(__name__)

class Lapps( Json ):
    """
        Lapps Container.

        A Lapps container is a JSON map with exactly two entries:
        - discriminator
        - payload

        Both the discriminator and payload are string objects, with the value
        of the discriminator being used to determine how the payload should be
        interpreted.

        This means we can identify a LAPPS document by searching for something
        that looks like JSON and starts with a key named "discriminator".
    """
    file_ext = "lapps"
    header = '''{"discriminator":'''
    blurb = "Lapps Data object"

    def sniff(self, filename):
        """
        Reads the start of the file (ignoring whitespace) looking for the
        required LIF header.

        :param filename: The name of the file to be checked.
        :return: True if filename is a LIF file, False otherwise.
        """
        #log.info("LAPPS sniffing %s", filename)
        with open(filename, "r") as fh:
            for c in self.header:
                if c != self.read(fh):
                    return False

        #log.info("Sniffed a LAPPS file.")
        return True

    def read(self, f):
        """
        Reads a single character from the file handle skipping over whitespace.

        :param f: an open file handle
        :return: the next non-whitespace character in the file.
        """
        c = f.read(1)
        while c.isspace():
            c = f.read(1)
        # end while
        return c


class Lif( Lapps ):
    """
        The Lapps Interchange Format.

        LIF files are json files conforming to the schema at
        http://vocab.lappsgrid.org/schema/lif.json  If we ignore whitespace
        we know EXACTLY what the opening sequence of characters will be.

    """
    file_ext = "lif"
    header = '''{"discriminator":"http://vocab.lappsgrid.org/ns/media/jsonld"'''
    blurb = "Lapps Interchange Format (LIF)"

    def sniff(self, filename):
        """
        Reads the start of the file (ignoring whitespace) looking for the
        required LIF header.

        :param filename: The name of the file to be checked.
        :return: True if filename is a LIF file, False otherwise.
        """
        #log.info("LIF: Sniffing %s", filename)
        with open(filename, "r") as fh:
            for c in self.header:
                if c != self.read(fh):
                    return False

        #log.info("Found a LIF file.")
        return True


class Gate( Lapps ):
    """
        GATE/XML in a JSON wrapper.
        See: http://gate.ac.uk
    """
    file_ext = "gate"
    header = '{"discriminator":"http://vocab.lappsgrid.org/ns/media/xml#gate"'
    blurb = "Gate/XML in a Lapps Container"

    def sniff(self, filename):
        """
        Reads the start of the file (ignoring whitespace) looking for the
        required GATE header.

        :param filename: The name of the file to be checked.
        :return: True if filename is a GATE file, False otherwise.
        """
        #log.info("GATE: Sniffing %s", filename)
        with open(filename, "r") as fh:
            for c in self.header:
                if c != self.read(fh):
                    return False

        #log.info("Found a GATE file.")
        return True

class Ldc( Lapps ):
    """
        LDC/XML in a JSON wrapper.
    """
    file_ext = "ldc"
    header = '{"discriminator":"http://vocab.lappsgrid.org/ns/media/xml#ldc"'
    blurb = "LDC/XML in a Lapps Container"

    def sniff(self, filename):
        """
        Reads the start of the file (ignoring whitespace) looking for the
        required LDC header.

        :param filename: The name of the file to be checked.
        :return: True if filename is a LDC/XML file, False otherwise.
        """
        #log.info("LDC: Sniffing %s", filename)
        with open(filename, "r") as fh:
            for c in self.header:
                if c != self.read(fh):
                    return False

        #log.info("Found a LDC file.")
        return True



