SUMMARY = "This is a Hello world program"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta-mylayer/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI = "git://git@github.com/wsliu28/yocto_files.git;protocol=ssh;branch=main"
SRCREV = "784cd0214463d1ffa3ba59be32a391dca202c149"
# SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} ${S}/main_test1.c -o main_test1
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/main_test1 ${D}${bindir}/
}