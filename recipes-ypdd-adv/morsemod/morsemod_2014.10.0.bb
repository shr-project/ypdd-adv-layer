DESCRIPTION = "Morse edge device simulator"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://license.txt;md5=47bc60f9825756218080dbd5e11c78a7"

inherit module

SRC_URI = "file://license.txt \
           file://Makefile \
           file://morsemod.c \
          "

S = "${WORKDIR}"

# Workaround, possible bug in Daisy?
# The system strips the module, but doesn't save any debug info..
INHIBIT_PACKAGE_STRIP = '1'
