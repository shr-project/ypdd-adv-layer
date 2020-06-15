require minnow-max-extras.inc

do_install() {
    # for now just copy the shell scripts and ignore the modules directory
    install -d -m755 ${D}${bindir}/minnow-max-extras/
    cp --preserve=mode,timestamps -R ${S}/calamari ${D}${bindir}/minnow-max-extras/
    cp --preserve=mode,timestamps -R ${S}/cpu ${D}${bindir}/minnow-max-extras/
    cp --preserve=mode,timestamps -R ${S}/hse ${D}${bindir}/minnow-max-extras/
    cp --preserve=mode,timestamps -R ${S}/lse ${D}${bindir}/minnow-max-extras/
    cp --preserve=mode,timestamps -R ${S}/onboard ${D}${bindir}/minnow-max-extras/
}

RDEPENDS_${PN} = " \
    bash \
    i2c-tools \
    kmod-minnow-max-calamari \
    kmod-minnow-max-i2c \
    kmod-minnow-max-ika \
    kmod-minnow-max-low-speed-spidev \
    kmod-minnow-max-mpu6050 \
"
