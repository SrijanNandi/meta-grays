SUMMARY = "grunt-cli"
DESCRIPTION = "The Grunt command line interface."
HOMEPAGE = "https://github.com/gruntjs/grunt-cli"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE-MIT;md5=331c934843c71c28b2bf98046c03eb97"


SRC_URI = "git://github.com/gruntjs/grunt-cli.git"

SRCREV = "3254a1f36eb70d3cb106441c79ef4a16951e3011"

inherit npm
inherit autotools

do_compile() {
    # changing the home directory to the working directory, the .npmrc will be created in this directory
    export HOME=${WORKDIR}

    # configure cache to be in working directory
    npm set cache ${WORKDIR}/npm_cache

    # clear local cache prior to each compile
    npm cache clear --force

    # compile and install node modules in source directory
    npm --arch=${TARGET_ARCH} --verbose install
}
