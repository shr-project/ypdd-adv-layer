LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://src/r8168.h;endline=27;md5=5f7032e8d63295accb1818dca0b296de"

PV = "8.048.03+git${SRCPV}"

SRCREV = "07c0397caa6ae84fa8a2cf55bda4d71bb082ca36"
SRC_URI = "git://github.com/mtorromeo/r8168.git;protocol=https"

S = "${WORKDIR}/git"

inherit module

EXTRA_OEMAKE += "KERNELDIR=${STAGING_KERNEL_DIR}"

# prevent make trying to install them into hosts /lib/modules during do_compile
MAKE_TARGETS = "modules"

# it's called just install, not modules_install
MODULES_INSTALL_TARGET = "install"
