LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://calamari/calamari-spidev-test.c;endline=16;md5=c6b62db27ad6e08ab73d318148027dc0"

SRCREV = "ac5f368d90c4f7aeea82b99d802f60fdbcaa6779"
SRC_URI += "git://github.com/shr-project/minnow-max-extras.git;protocol=https"

PV = "0.1+git${SRCPV}"

S = "${WORKDIR}/git"
