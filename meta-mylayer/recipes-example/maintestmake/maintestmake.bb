SUMMARY = "This is a Hello world program"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta-mylayer/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "git://git@github.com/wsliu28/yocto_files_make.git;protocol=ssh;branch=main"
#SRCREV = "f3bb697b3491d311a04bebfca6136a6cd5b1d887"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

EXTRA_OEMAKE:append = " DESTDIR=${D} BINDIR=${bindir}"
EXTRA_OEMAKE:append = " MAIN_OBJ=main_test_make.o TEST_OBJ=test_make.o"
EXTRA_OEMAKE:append = " MAIN_SOURCE=main_test_make.c TEST_SOURCE=test_make.c"

do_compile() {
    oe_runmake maintestmake
}

do_install() {
#    install -d ${D}${bindir}
#    install -m 0755 ${S}/maintestmake ${D}${bindir}/
    oe_runmake install
}