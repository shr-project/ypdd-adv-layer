LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://calamari/calamari-spidev-test.c;endline=16;md5=c6b62db27ad6e08ab73d318148027dc0"

SRCREV = "d8589f4543cea45e3e4cba254a9aaa02b6ff4b9d"
SRC_URI += "git://github.com/shr-project/minnow-max-extras.git;protocol=https"

S = "${WORKDIR}/git"

do_install() {
    # for now just copy the shell scripts and ignore the modules directory
    install -d -m755 ${D}${bindir}/minnow-max-extras/
    cp --preserve=mode,timestamps -R ${S}/calamari ${D}${bindir}/minnow-max-extras/
    cp --preserve=mode,timestamps -R ${S}/cpu ${D}${bindir}/minnow-max-extras/
    cp --preserve=mode,timestamps -R ${S}/hse ${D}${bindir}/minnow-max-extras/
    cp --preserve=mode,timestamps -R ${S}/lse ${D}${bindir}/minnow-max-extras/
    cp --preserve=mode,timestamps -R ${S}/onboard ${D}${bindir}/minnow-max-extras/
}

RDEPENDS_${PN} = "bash i2c-tools"
