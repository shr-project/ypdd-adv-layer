require minnow-max-extras.inc

S = "${WORKDIR}/git/modules/${MODDIR}"

inherit module

EXTRA_OEMAKE += "KDIR=${STAGING_KERNEL_DIR}"
