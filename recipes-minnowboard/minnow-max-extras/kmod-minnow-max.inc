require minnow-max-extras.inc

S = "${WORKDIR}/git/modules/${MODDIR}"

inherit module

#EXTRA_OEMAKE += "KERNELDIR=${STAGING_KERNEL_DIR}"

# prevent make trying to install them into hosts /lib/modules during do_compile
#MAKE_TARGETS = "modules"

# it's called just install, not modules_install
#MODULES_INSTALL_TARGET = "install"
