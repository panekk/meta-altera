LINUX_VERSION = "4.16"

SRCREV = "95339bdd2f35ee42d00ce5ebbd958a6732ad5b94"

KBUILD_DEFCONFIG_stratix10 := "s10_devkit_defconfig"

include linux-altera.inc

KERNEL_DEVICETREE_arria10_append ?= " socfpga_arria10_socdk_nand.dtb"
KERNEL_DEVICETREE_cyclone5_append ?= " \
	socfpga_cyclone5_mcvevk.dtb socfpga_cyclone5_sodia.dtb \
	socfpga_cyclone5_trcom.dtb socfpga_cyclone5_vining_fpga.dtb \
	"

FILESEXTRAPATHS_prepend := "${THISDIR}/config:"

SRC_URI_append_cyclone5 = " file://config_lbdaf.cfg "
SRC_URI_append_arria5 = " file://config_lbdaf.cfg "
SRC_URI_append_arria10 = " file://config_lbdaf.cfg "

