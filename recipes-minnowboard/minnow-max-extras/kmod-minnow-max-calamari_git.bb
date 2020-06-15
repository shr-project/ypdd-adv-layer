require kmod-minnow-max.inc

MODNAME = "calamari"
MODDIR = "${MODNAME}-1.0"

do_install() {
    install -Dm644 ${S}/${MODNAME}.ko ${D}${nonarch_base_libdir}/modules/${KERNEL_VERSION}/${MODNAME}.ko
}
