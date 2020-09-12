# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "The grunt command line interface"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/findup-sync/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md
#   node_modules/nopt/node_modules/abbrev/LICENSE
#   node_modules/grunt-known-options/LICENSE
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "Unknown & ISC & MIT"
LIC_FILES_CHKSUM = "file://node_modules/findup-sync/LICENSE-MIT;md5=159111132f87941857a4f42d60c880c8 \
                    file://node_modules/findup-sync/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/findup-sync/node_modules/glob/node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://node_modules/findup-sync/node_modules/glob/node_modules/inflight/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/findup-sync/node_modules/glob/node_modules/inflight/node_modules/once/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/findup-sync/node_modules/glob/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/findup-sync/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/LICENSE;md5=a5df515ef062cc3affd8c0ae59c059ec \
                    file://node_modules/findup-sync/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://node_modules/findup-sync/node_modules/glob/node_modules/minimatch/node_modules/brace-expansion/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/findup-sync/node_modules/glob/node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/findup-sync/node_modules/glob/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/resolve/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://node_modules/nopt/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://node_modules/nopt/node_modules/abbrev/LICENSE;md5=e9c0b639498fbe60d17b10099aba77c0 \
                    file://node_modules/grunt-known-options/LICENSE;md5=331e7399a324dbd9645b0d949ab3996b"

SRC_URI = "npm://registry.npmjs.org/;name=grunt-cli;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-findup-sync-glob-inflight-once-wrappy = "ISC"
LICENSE_${PN}-findup-sync-glob-inflight-once = "ISC"
LICENSE_${PN}-findup-sync-glob-inflight = "ISC"
LICENSE_${PN}-findup-sync-glob-inherits = "ISC"
LICENSE_${PN}-findup-sync-glob-minimatch-brace-expansion-balanced-match = "MIT"
LICENSE_${PN}-findup-sync-glob-minimatch-brace-expansion-concat-map = "MIT"
LICENSE_${PN}-findup-sync-glob-minimatch-brace-expansion = "MIT"
LICENSE_${PN}-findup-sync-glob-minimatch = "ISC"
LICENSE_${PN}-findup-sync-glob-path-is-absolute = "MIT"
LICENSE_${PN}-findup-sync-glob = "ISC"
LICENSE_${PN}-findup-sync = "MIT"
LICENSE_${PN}-grunt-known-options = "MIT"
LICENSE_${PN}-nopt-abbrev = "ISC"
LICENSE_${PN}-nopt = "ISC"
LICENSE_${PN}-resolve-test-pathfilter-deep-ref-deep = "Unknown"
LICENSE_${PN}-resolve-test-resolver-biz-garply = "Unknown"
LICENSE_${PN}-resolve-test-subdirs-a = "Unknown"
LICENSE_${PN}-resolve = "MIT"
LICENSE_${PN} = "MIT"


