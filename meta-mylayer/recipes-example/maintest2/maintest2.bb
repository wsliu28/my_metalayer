SUMMARY = "This is a Hello world program"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta-mylayer/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "git://git@github.com/wsliu28/yocto_files.git;protocol=ssh;branch=main"
SRCREV = "2bdbeeac2895e462bcb6a55e9d8f03e5bebab28d"
# SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} ${S}/main_test2.c ${S}/test2.c -o maintest2
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/maintest2 ${D}${bindir}/
}