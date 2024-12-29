SUMMARY = "This is a Hello world program"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta-mylayer/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

SRC_URI =   "file://helloworld.c file://test1.c"

S = "${WORKDIR}/build"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} ${WORKDIR}/helloworld.c ${WORKDIR}/test1.c -o ${S}/helloworld
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/helloworld ${D}${bindir}/
}