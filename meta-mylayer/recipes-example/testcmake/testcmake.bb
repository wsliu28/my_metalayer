SUMMARY = "This is a test for cmake"

LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COREBASE}/meta-mylayer/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"


SRC_URI =   "file://test1.cpp file://CMakeLists.txt file://maincmake.cpp"

S = "${WORKDIR}"

inherit cmake

