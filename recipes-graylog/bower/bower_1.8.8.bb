# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = "The browser package manager"
HOMEPAGE = "http://bower.io"
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   lib/node_modules/jsbn/LICENSE
#   lib/node_modules/requireg/LICENSE
#   lib/node_modules/requireg/node_modules/rc/LICENSE.BSD
#   lib/node_modules/requireg/node_modules/rc/LICENSE.APACHE2
#   lib/node_modules/tunnel-agent/LICENSE
#   lib/node_modules/cardinal/LICENSE
#   lib/node_modules/oauth-sign/LICENSE
#   lib/node_modules/inquirer/node_modules/lodash/LICENSE
#   lib/node_modules/rc/LICENSE.BSD
#   lib/node_modules/rc/LICENSE.APACHE2
#   lib/node_modules/dashdash/LICENSE.txt
#   lib/node_modules/spdx-license-ids/LICENSE
#   lib/node_modules/spdx-license-ids/spdx-license-ids.json
#   lib/node_modules/boom/LICENSE
#   lib/node_modules/boom/node_modules/hoek/LICENSE
#   lib/node_modules/retry/License
#   lib/node_modules/process-nextick-args/license.md
#   lib/node_modules/bower-registry-client/node_modules/qs/LICENSE
#   lib/node_modules/bower-registry-client/node_modules/tunnel-agent/LICENSE
#   lib/node_modules/bower-registry-client/node_modules/tough-cookie/LICENSE
#   lib/node_modules/bower-registry-client/node_modules/caseless/LICENSE
#   lib/node_modules/bower-registry-client/node_modules/request/LICENSE
#   lib/node_modules/amdefine/LICENSE
#   lib/node_modules/spdx-correct/LICENSE
#   lib/node_modules/semver/LICENSE
#   lib/node_modules/ansicolors/LICENSE
#   lib/node_modules/verror/LICENSE
#   lib/node_modules/hawk/LICENSE
#   lib/node_modules/hawk/node_modules/hoek/LICENSE
#   lib/node_modules/jsprim/LICENSE
#   lib/node_modules/uglify-js/LICENSE
#   lib/node_modules/uglify-js/node_modules/source-map/LICENSE
#   lib/node_modules/normalize-package-data/LICENSE
#   lib/node_modules/redeyed/LICENSE
#   lib/node_modules/caseless/LICENSE
#   lib/node_modules/through/LICENSE.APACHE2
#   lib/node_modules/sntp/LICENSE
#   lib/node_modules/sntp/node_modules/hoek/LICENSE
#   lib/node_modules/readable-stream/LICENSE
#   lib/node_modules/readable-stream/node_modules/string_decoder/LICENSE
#   lib/node_modules/configstore/node_modules/uuid/LICENSE.md
#   lib/node_modules/isstream/LICENSE.md
#   lib/node_modules/tar-stream/node_modules/bl/LICENSE.md
#   lib/node_modules/cryptiles/LICENSE
#   lib/node_modules/ecc-jsbn/lib/LICENSE-jsbn
#   lib/node_modules/touch/node_modules/nopt/LICENSE
#   lib/node_modules/request/LICENSE
#   lib/node_modules/request/node_modules/qs/LICENSE
#   lib/node_modules/request/node_modules/tough-cookie/LICENSE
#   lib/node_modules/bl/LICENSE.md
#   lib/node_modules/tweetnacl/LICENSE
#   lib/node_modules/extsprintf/LICENSE
#   lib/node_modules/asn1/LICENSE
#   lib/node_modules/traverse/LICENSE
#   lib/node_modules/fs.realpath/LICENSE
#   lib/node_modules/validate-npm-package-license/LICENSE
#   lib/node_modules/forever-agent/LICENSE
#   lib/node_modules/aws-sign2/LICENSE
#   lib/node_modules/lodash/LICENSE
#   lib/node_modules/duplexer2/LICENSE.md
#   lib/node_modules/balanced-match/LICENSE.md
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "BSD & PD & Unlicense & BSD-2-Clause & Apache-2.0 & \
(BSD-3-Clause | MIT) & ISC & Unknown & BSD-3-Clause & MIT & APACHEv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b9d0f27ea752b176045383eb2d1f3ce0 \
                    file://lib/node_modules/lazy-cache/LICENSE;md5=a0bd3ad96ad6f399ce73b75ce8332105 \
                    file://lib/node_modules/pump/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://lib/node_modules/chalk/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/chalk/node_modules/supports-color/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/chalk/node_modules/ansi-styles/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/jsbn/LICENSE;md5=c6ea389b6b52325149beeec27075c5ac \
                    file://lib/node_modules/decompress-zip/node_modules/readable-stream/LICENSE;md5=d7351a4fc8e956f1a68413490d5e655e \
                    file://lib/node_modules/requireg/LICENSE;md5=6f72b5c230b5c3e89a650ba77c9f793e \
                    file://lib/node_modules/requireg/node_modules/deep-extend/LICENSE;md5=bc5906b733dd41294a90abaab11cb7d3 \
                    file://lib/node_modules/requireg/node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://lib/node_modules/requireg/node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://lib/node_modules/requireg/node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://lib/node_modules/requireg/node_modules/resolve/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/requireg/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/strip-bom/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/deep-extend/LICENSE;md5=74959162613f2777f3ef55bdb8b74c89 \
                    file://lib/node_modules/handlebars/LICENSE;md5=f9c332d266d014f0a7c58341370ce085 \
                    file://lib/node_modules/registry-url/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/is-finite/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/json-stable-stringify/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/ext-list/license;md5=096d384e4ba012421367cebb5a485d19 \
                    file://lib/node_modules/is-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://lib/node_modules/indent-string/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/is-retry-allowed/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://lib/node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://lib/node_modules/junk/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/window-size/LICENSE-MIT;md5=356865268599668702955e0728242b7e \
                    file://lib/node_modules/redent/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/meow/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/prepend-http/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/fs-write-stream-atomic/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/is-fullwidth-code-point/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/pify/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/cardinal/LICENSE;md5=e805edd80c5a2e7d96470660b4101f0c \
                    file://lib/node_modules/find-up/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/oauth-sign/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://lib/node_modules/findup-sync/LICENSE-MIT;md5=159111132f87941857a4f42d60c880c8 \
                    file://lib/node_modules/findup-sync/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/camelcase/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/ext-name/license;md5=096d384e4ba012421367cebb5a485d19 \
                    file://lib/node_modules/has-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/combined-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://lib/node_modules/sshpk/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://lib/node_modules/util-deprecate/LICENSE;md5=b7c99ef4b0f3ad9911a52219947f8cf0 \
                    file://lib/node_modules/restore-cursor/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/got/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/run-async/LICENSE;md5=a2c64a5ee43edd29ae76900950466998 \
                    file://lib/node_modules/read/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/read/node_modules/mute-stream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/request-progress/LICENSE;md5=656b8404ca82d1b2e646125bbf3b2251 \
                    file://lib/node_modules/pinkie/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://lib/node_modules/abbrev/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/xdg-basedir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/inquirer/node_modules/lodash/LICENSE;md5=f519f8cb155e30cece6b0e75aa6a3a53 \
                    file://lib/node_modules/graceful-fs/LICENSE;md5=fd63805fd8e3797063b247781e5ee6e4 \
                    file://lib/node_modules/cli-width/LICENSE;md5=cfb072f1bc7e564626cd6b5164a13e59 \
                    file://lib/node_modules/loud-rejection/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/md5-hex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/code-point-at/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/getpass/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://lib/node_modules/untildify/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/opn/license;md5=678789ec2c79f7768d0bd27eceaa7a74 \
                    file://lib/node_modules/rc/LICENSE.BSD;md5=e7a2a325a0069e82aff675bbf74464a0 \
                    file://lib/node_modules/rc/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://lib/node_modules/rc/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://lib/node_modules/q/LICENSE;md5=92d3cc1db292f6b3978ef90f05ec4548 \
                    file://lib/node_modules/dashdash/LICENSE.txt;md5=ebce61c1a0900d798daaf5853c69ce72 \
                    file://lib/node_modules/array-find-index/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/xtend/LICENCE;md5=96bcdf84e670aafacac9e094bce29ac9 \
                    file://lib/node_modules/repeating/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/stringify-object/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/spdx-license-ids/LICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680 \
                    file://lib/node_modules/spdx-license-ids/spdx-license-ids.json;md5=34af712b0ca5a258cf12f8d705366856 \
                    file://lib/node_modules/boom/LICENSE;md5=d5c0c437eeeff35277efeadaec74e821 \
                    file://lib/node_modules/boom/node_modules/hoek/LICENSE;md5=0ae863d44c9a840e5cc04241d8d9c736 \
                    file://lib/node_modules/co/LICENSE;md5=1cb994f27906c83d46a3cc6d9e1d8d6c \
                    file://lib/node_modules/uglify-to-browserify/LICENSE;md5=10d1d4024d61361102888126d4347f7b \
                    file://lib/node_modules/retry/License;md5=c40fe50d231414ad1bc68e8965e7e95e \
                    file://lib/node_modules/boxen/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/har-validator/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://lib/node_modules/ini/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/uuid/LICENSE.md;md5=c9420736e23afb538ba5fbe44197f0b4 \
                    file://lib/node_modules/stringstream/LICENSE.txt;md5=3b3d0996fc07ae2d89c4659b9ffcbe2e \
                    file://lib/node_modules/destroy/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://lib/node_modules/lockfile/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/array-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/create-error-class/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://lib/node_modules/process-nextick-args/license.md;md5=216769dac98a78ec088ee7cc6fad1dfa \
                    file://lib/node_modules/resolve/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/performance-now/license.txt;md5=4c1faf980adc2df1831ff8c0e47897e8 \
                    file://lib/node_modules/http-signature/LICENSE;md5=38ecf0a3a3894f404ca99c2a08924afc \
                    file://lib/node_modules/core-util-is/LICENSE;md5=6126e36127d20ec0e2f637204a5c68ff \
                    file://lib/node_modules/registry-auth-token/LICENSE;md5=7b1df94b672916450d194cf7a8bd0e2d \
                    file://lib/node_modules/chownr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/bower-config/LICENSE;md5=db09c6fb770759523a76516589fa0023 \
                    file://lib/node_modules/bower-config/node_modules/mout/LICENSE.md;md5=1e146f50c4474760e9a1a41fb8418904 \
                    file://lib/node_modules/bower-registry-client/LICENSE;md5=db09c6fb770759523a76516589fa0023 \
                    file://lib/node_modules/bower-registry-client/node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://lib/node_modules/bower-registry-client/node_modules/tunnel-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://lib/node_modules/bower-registry-client/node_modules/har-validator/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://lib/node_modules/bower-registry-client/node_modules/tough-cookie/LICENSE;md5=ceb9c658d7a5d62bee6628c46832168e \
                    file://lib/node_modules/bower-registry-client/node_modules/caseless/LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3 \
                    file://lib/node_modules/bower-registry-client/node_modules/request/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://lib/node_modules/bower-registry-client/node_modules/async/LICENSE;md5=64a378b2b01424fe22d54bc626175994 \
                    file://lib/node_modules/bower-registry-client/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://lib/node_modules/nopt/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/rimraf/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/rimraf/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/amdefine/LICENSE;md5=539b1c7ad0ada7756d6d01b9db20f680 \
                    file://lib/node_modules/inflight/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://lib/node_modules/jsonpointer/LICENSE.md;md5=6f8a932f950cc1ae4cff952b7ef5abd6 \
                    file://lib/node_modules/mute-stream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/md5-o-matic/LICENSE;md5=52abe3c54900cd8152d32bd9cd4395ca \
                    file://lib/node_modules/end-of-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://lib/node_modules/lru-cache/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/number-is-nan/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/mout/LICENSE.md;md5=1e146f50c4474760e9a1a41fb8418904 \
                    file://lib/node_modules/spdx-correct/LICENSE;md5=ca5e6e21d7a7e605acf273fb65e5472a \
                    file://lib/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/map-obj/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/request-replay/LICENSE;md5=656b8404ca82d1b2e646125bbf3b2251 \
                    file://lib/node_modules/wrappy/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://lib/node_modules/read-pkg-up/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/chmodr/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/strip-json-comments/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/json-stringify-safe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/semver/LICENSE;md5=8ce909f9cccb74a7c6f2720930d072c1 \
                    file://lib/node_modules/onetime/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/slide/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://lib/node_modules/is-utf8/LICENSE;md5=10d1495ba46609e55e586ab71fa81f45 \
                    file://lib/node_modules/ansicolors/LICENSE;md5=bf595075ff556bc46c43e08f142fa4f5 \
                    file://lib/node_modules/verror/LICENSE;md5=04fce49dd88d841ceb36616ab9789ce0 \
                    file://lib/node_modules/cliui/LICENSE.txt;md5=83623193d3051ca8068a89a455c699ca \
                    file://lib/node_modules/timed-out/license;md5=2a8369b875113ae53aa6c5bb39a58d3c \
                    file://lib/node_modules/is-plain-obj/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/hawk/LICENSE;md5=e027b6d4642f6a1131d030b119fa8f50 \
                    file://lib/node_modules/hawk/node_modules/hoek/LICENSE;md5=0ae863d44c9a840e5cc04241d8d9c736 \
                    file://lib/node_modules/jsprim/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://lib/node_modules/uglify-js/LICENSE;md5=4677f24cba62224b999bcb8da6e05fb4 \
                    file://lib/node_modules/uglify-js/node_modules/source-map/LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44 \
                    file://lib/node_modules/builtin-modules/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/semver-diff/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/semver-diff/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/har-schema/LICENSE;md5=bfa81591facc9224e4c7451c8dc12958 \
                    file://lib/node_modules/glob/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/glob/node_modules/minimatch/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/latest-version/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/mkpath/LICENSE;md5=6471aec73f6674c4d85259bac2389f8f \
                    file://lib/node_modules/generate-object-property/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://lib/node_modules/github/LICENSE;md5=ff9428e2d5286b07ce6e043acf76f668 \
                    file://lib/node_modules/is-my-json-valid/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://lib/node_modules/ansi-escapes/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/normalize-package-data/LICENSE;md5=745d0cb7803882ab26451fefb149878e \
                    file://lib/node_modules/normalize-package-data/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/pinkie-promise/license;md5=be72c3ad86c1c4e9578a1945b082b17d \
                    file://lib/node_modules/redeyed/LICENSE;md5=e805edd80c5a2e7d96470660b4101f0c \
                    file://lib/node_modules/caseless/LICENSE;md5=e9dadf023ba6ebd98e3e0acb6e2470e3 \
                    file://lib/node_modules/cli-cursor/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/figures/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/through/LICENSE.MIT;md5=e0f70a42adf526e6f5e605a94d98a420 \
                    file://lib/node_modules/through/LICENSE.APACHE2;md5=ffcf739dca268cb0f20336d6c1a038f1 \
                    file://lib/node_modules/isexe/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/url-parse-lax/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/load-json-file/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/aws4/LICENSE;md5=ff6f181928a91d8631d565516b4db3cb \
                    file://lib/node_modules/extend/LICENSE;md5=33d9f7a91df276ec16aa941032ee1476 \
                    file://lib/node_modules/right-align/LICENSE;md5=e060235353cb686ae1695ec7db63cfbc \
                    file://lib/node_modules/sntp/LICENSE;md5=6b3f1791e9fe721a645d793af56193c6 \
                    file://lib/node_modules/sntp/node_modules/hoek/LICENSE;md5=0ae863d44c9a840e5cc04241d8d9c736 \
                    file://lib/node_modules/unzip-response/license;md5=5b422d6bf88afe88977d04f8bdd4959c \
                    file://lib/node_modules/readable-stream/LICENSE;md5=a67a7926e54316d90c14f74f71080977 \
                    file://lib/node_modules/readable-stream/node_modules/string_decoder/LICENSE;md5=14af51f8c0a6c6e400b53e18c6e5f85c \
                    file://lib/node_modules/configstore/node_modules/uuid/LICENSE.md;md5=c1a615ca498934d9a312c2d5294cf2cf \
                    file://lib/node_modules/configstore/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://lib/node_modules/configstore/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/isstream/LICENSE.md;md5=1798150b9d70250c42b55b3530e6af2b \
                    file://lib/node_modules/is-obj/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/tar-stream/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://lib/node_modules/tar-stream/node_modules/bl/LICENSE.md;md5=e58dc7a94bb9decf6a7b2ff97d22b213 \
                    file://lib/node_modules/cryptiles/LICENSE;md5=6e2f87804ca8061967f7891dfb34f6f0 \
                    file://lib/node_modules/ecc-jsbn/LICENSE;md5=0d289b6d63cbcc18e4b2af9a5bd28b54 \
                    file://lib/node_modules/ecc-jsbn/lib/LICENSE-jsbn;md5=32052d48bacabd1c02e56c6889082a27 \
                    file://lib/node_modules/sort-keys-length/LICENSE.md;md5=bdc5f651441a841cb2401510972db6d7 \
                    file://lib/node_modules/bower-endpoint-parser/LICENSE;md5=db09c6fb770759523a76516589fa0023 \
                    file://lib/node_modules/array-reduce/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/touch/LICENSE;md5=90a3ca01a5efed8b813a81c6c8fa2e63 \
                    file://lib/node_modules/touch/node_modules/nopt/LICENSE;md5=b3245a33f2d41818f14c489bd33bc4a8 \
                    file://lib/node_modules/request/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://lib/node_modules/request/node_modules/qs/LICENSE;md5=d5c7c6dc45a33a0a9620ed81315672d7 \
                    file://lib/node_modules/request/node_modules/tough-cookie/LICENSE;md5=ceb9c658d7a5d62bee6628c46832168e \
                    file://lib/node_modules/request/node_modules/async/LICENSE;md5=9ec5487258cc65072647c5488b4d59ad \
                    file://lib/node_modules/request/node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://lib/node_modules/sort-keys/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/async/LICENSE;md5=dc113e0fc4029c29942399ad22425402 \
                    file://lib/node_modules/bower-logger/LICENSE;md5=db09c6fb770759523a76516589fa0023 \
                    file://lib/node_modules/bl/LICENSE.md;md5=7489efd5cf7c4575f9898b7eab7aeeb0 \
                    file://lib/node_modules/bl/node_modules/readable-stream/LICENSE;md5=d7351a4fc8e956f1a68413490d5e655e \
                    file://lib/node_modules/yargs/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://lib/node_modules/tweetnacl/LICENSE;md5=911690f51af322440237a253d695d19f \
                    file://lib/node_modules/center-align/LICENSE;md5=e060235353cb686ae1695ec7db63cfbc \
                    file://lib/node_modules/is-property/LICENSE;md5=34aed54d1454553d81a843e946b173a0 \
                    file://lib/node_modules/user-home/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/path-is-absolute/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/promptly/LICENSE;md5=656b8404ca82d1b2e646125bbf3b2251 \
                    file://lib/node_modules/os-homedir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/fstream/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/fstream/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://lib/node_modules/fstream/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/bower-json/LICENSE;md5=e273de0d9430b4e4a74446f00e19ac54 \
                    file://lib/node_modules/package-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/package-json/node_modules/semver/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/osenv/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/ajv/LICENSE;md5=715855234c57d97032971adfc0608a07 \
                    file://lib/node_modules/repeat-string/LICENSE;md5=fad3c8b9c04b365012f3d6821f2dda61 \
                    file://lib/node_modules/currently-unhandled/license;md5=289129afe2c8d393c7a535bcdcbddb86 \
                    file://lib/node_modules/signal-exit/LICENSE.txt;md5=e29e20260a1c78dba16a233048565cde \
                    file://lib/node_modules/is-typedarray/LICENSE.md;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/strip-ansi/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/once/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/read-pkg/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/extsprintf/LICENSE;md5=bc3c23d98d7aa86bbf232058884e19b2 \
                    file://lib/node_modules/shell-quote/LICENSE;md5=31f6d70a3b756797901b2aff55cc7d7a \
                    file://lib/node_modules/node-uuid/LICENSE.md;md5=465a37064da7d113df228e930a1cfdcd \
                    file://lib/node_modules/delayed-stream/License;md5=5270b4ddb6700d0a820e6d066744589c \
                    file://lib/node_modules/is-stream/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/tar-fs/LICENSE;md5=9befe7026bf915886cd566a98117c80e \
                    file://lib/node_modules/tar-fs/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://lib/node_modules/tar-fs/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/archy/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/iferr/LICENSE;md5=71eb11f3dd6fa9d8989eb0aea3ce6e96 \
                    file://lib/node_modules/asn1/LICENSE;md5=5ce2f42143c298495637e28e40cd5462 \
                    file://lib/node_modules/os-tmpdir/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/kind-of/LICENSE;md5=c8f80ed52c9074414e8a69541cdc1587 \
                    file://lib/node_modules/widest-line/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/p-throttler/LICENSE;md5=656b8404ca82d1b2e646125bbf3b2251 \
                    file://lib/node_modules/p-throttler/node_modules/q/LICENSE;md5=01f14ab73df415589e76982ec93503ae \
                    file://lib/node_modules/traverse/LICENSE;md5=0f6546e91538ce8c26b2da1623705c62 \
                    file://lib/node_modules/align-text/LICENSE;md5=e060235353cb686ae1695ec7db63cfbc \
                    file://lib/node_modules/fstream-ignore/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/camelcase-keys/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/camelcase-keys/node_modules/camelcase/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/spdx-expression-parse/LICENSE;md5=35a411d082d4487ab0e0287014cddf80 \
                    file://lib/node_modules/fs.realpath/LICENSE;md5=062470525c8e380f8567f665ef554d11 \
                    file://lib/node_modules/dot-prop/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/parse-json/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://lib/node_modules/tmp/LICENSE;md5=4502395b4fdb20719bf54bfb416efe5d \
                    file://lib/node_modules/is-arrayish/LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102 \
                    file://lib/node_modules/string_decoder/LICENSE;md5=fcf5cfdc777e49f11402422c72a86f43 \
                    file://lib/node_modules/punycode/LICENSE-MIT.txt;md5=ee9bd8b835cfcd512dd644540dd96987 \
                    file://lib/node_modules/validate-npm-package-license/LICENSE;md5=a9767b1b0e66e9af6cdd9ff185964ccc \
                    file://lib/node_modules/longest/LICENSE;md5=360e60c9b7aa16428ee600ff20935e1f \
                    file://lib/node_modules/strip-indent/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/optimist/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://lib/node_modules/optimist/node_modules/wordwrap/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/optimist/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/write-file-atomic/LICENSE;md5=68705ba56afdf6710c9187ed9a9cdd03 \
                    file://lib/node_modules/string-width/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/node-status-codes/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/forever-agent/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://lib/node_modules/aws-sign2/LICENSE;md5=f3f8ead5440d1c311b45be065d135d90 \
                    file://lib/node_modules/ends-with/LICENSE-MIT;md5=f5942cc846769a67851bfcde0c5c5a03 \
                    file://lib/node_modules/form-data/License;md5=7aa505292e2636a9e59d4d3f258f4819 \
                    file://lib/node_modules/lodash/LICENSE;md5=8f10c81975f996c3ba5b424884b4af96 \
                    file://lib/node_modules/mkdirp/LICENSE;md5=b2d989bc186e7f6b418a5fdd5cc0b56b \
                    file://lib/node_modules/mkdirp/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/duplexer2/LICENSE.md;md5=2ac3dfdce5a77f9cff9b5f70d216d17d \
                    file://lib/node_modules/path-exists/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/trim-newlines/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/is-builtin-module/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/read-all-stream/license;md5=2a8369b875113ae53aa6c5bb39a58d3c \
                    file://lib/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://lib/node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://lib/node_modules/decamelize/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/balanced-match/LICENSE.md;md5=7fa99ddc3424107350ca6e9a24552085 \
                    file://lib/node_modules/hosted-git-info/LICENSE;md5=a01f10cd299d5727263720d47cc2c908 \
                    file://lib/node_modules/minimist/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/mime/LICENSE;md5=8e8ea2ad138ce468f8570a0edbadea65 \
                    file://lib/node_modules/which/LICENSE;md5=82703a69f6d7411dde679954c2fd9dca \
                    file://lib/node_modules/asynckit/LICENSE;md5=177bc287fb9558bf3ea50b440c1c86ff \
                    file://lib/node_modules/commander/LICENSE;md5=25851d4d10d6611a12d5571dab945a00 \
                    file://lib/node_modules/concat-map/LICENSE;md5=aea1cde69645f4b99be4ff7ca9abcce1 \
                    file://lib/node_modules/is-redirect/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/nested-error-stacks/LICENSE;md5=6c265ae5e7946b8ebc7103738288d6df \
                    file://lib/node_modules/filled-array/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/error-ex/LICENSE;md5=e67c75e89656b80fd99cb7d30fb43102 \
                    file://lib/node_modules/path-type/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/ansi-regex/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://lib/node_modules/escape-string-regexp/license;md5=a12ebca0510a773644101a99a867d210"

SRC_URI = "npm://registry.npmjs.org/;name=bower;version=${PV}"

NPM_SHRINKWRAP := "${THISDIR}/${PN}/npm-shrinkwrap.json"

inherit npm

# Must be set after inherit npm since that itself sets S
S = "${WORKDIR}/npmpkg"
LICENSE_${PN}-lib-abbrev = "ISC"
LICENSE_${PN}-lib-ajv = "MIT"
LICENSE_${PN}-lib-align-text = "MIT"
LICENSE_${PN}-lib-amdefine = "(BSD-3-Clause_|_MIT)"
LICENSE_${PN}-lib-ansi-escapes = "MIT"
LICENSE_${PN}-lib-ansi-regex = "MIT"
LICENSE_${PN}-lib-ansicolors = "MIT"
LICENSE_${PN}-lib-archy = "MIT"
LICENSE_${PN}-lib-array-filter = "MIT"
LICENSE_${PN}-lib-array-find-index = "MIT"
LICENSE_${PN}-lib-array-map = "MIT"
LICENSE_${PN}-lib-array-reduce = "MIT"
LICENSE_${PN}-lib-asn1 = "MIT"
LICENSE_${PN}-lib-assert-plus = "MIT"
LICENSE_${PN}-lib-asynckit = "MIT"
LICENSE_${PN}-lib-async = "MIT"
LICENSE_${PN}-lib-aws-sign2 = "Apache-2.0"
LICENSE_${PN}-lib-aws4 = "MIT"
LICENSE_${PN}-lib-balanced-match = "MIT"
LICENSE_${PN}-lib-bcrypt-pbkdf = "BSD-3-Clause"
LICENSE_${PN}-lib-binary = "MIT"
LICENSE_${PN}-lib-bl-readable-stream = "MIT"
LICENSE_${PN}-lib-bl = "MIT"
LICENSE_${PN}-lib-boom-hoek = "BSD-3-Clause"
LICENSE_${PN}-lib-boom = "BSD-3-Clause"
LICENSE_${PN}-lib-bower-config-mout = "MIT"
LICENSE_${PN}-lib-bower-config = "MIT"
LICENSE_${PN}-lib-bower-endpoint-parser = "MIT"
LICENSE_${PN}-lib-bower-json = "MIT"
LICENSE_${PN}-lib-bower-logger = "MIT"
LICENSE_${PN}-lib-bower-registry-client-async = "MIT"
LICENSE_${PN}-lib-bower-registry-client-caseless = "Apache-2.0"
LICENSE_${PN}-lib-bower-registry-client-har-validator = "ISC"
LICENSE_${PN}-lib-bower-registry-client-mkdirp = "MIT"
LICENSE_${PN}-lib-bower-registry-client-qs = "BSD-3-Clause"
LICENSE_${PN}-lib-bower-registry-client-request = "Apache-2.0"
LICENSE_${PN}-lib-bower-registry-client-tough-cookie = "BSD-3-Clause"
LICENSE_${PN}-lib-bower-registry-client-tunnel-agent = "Apache-2.0"
LICENSE_${PN}-lib-bower-registry-client = "MIT"
LICENSE_${PN}-lib-boxen = "MIT"
LICENSE_${PN}-lib-brace-expansion = "MIT"
LICENSE_${PN}-lib-buffers = "Unknown"
LICENSE_${PN}-lib-builtin-modules = "MIT"
LICENSE_${PN}-lib-camelcase-keys-camelcase = "MIT"
LICENSE_${PN}-lib-camelcase-keys = "MIT"
LICENSE_${PN}-lib-camelcase = "MIT"
LICENSE_${PN}-lib-capture-stack-trace = "MIT"
LICENSE_${PN}-lib-cardinal = "MIT"
LICENSE_${PN}-lib-caseless = "Apache-2.0"
LICENSE_${PN}-lib-center-align = "MIT"
LICENSE_${PN}-lib-chainsaw = "MIT"
LICENSE_${PN}-lib-chalk-ansi-styles = "MIT"
LICENSE_${PN}-lib-chalk-supports-color = "MIT"
LICENSE_${PN}-lib-chalk = "MIT"
LICENSE_${PN}-lib-chmodr = "ISC"
LICENSE_${PN}-lib-chownr = "ISC"
LICENSE_${PN}-lib-cli-cursor = "MIT"
LICENSE_${PN}-lib-cli-width = "ISC"
LICENSE_${PN}-lib-cliui-wordwrap = "MIT"
LICENSE_${PN}-lib-cliui = "ISC"
LICENSE_${PN}-lib-code-point-at = "MIT"
LICENSE_${PN}-lib-combined-stream = "MIT"
LICENSE_${PN}-lib-commander = "MIT"
LICENSE_${PN}-lib-concat-map = "MIT"
LICENSE_${PN}-lib-configstore-minimist = "MIT"
LICENSE_${PN}-lib-configstore-mkdirp = "MIT"
LICENSE_${PN}-lib-configstore-uuid = "MIT"
LICENSE_${PN}-lib-configstore = "BSD-2-Clause"
LICENSE_${PN}-lib-core-util-is = "MIT"
LICENSE_${PN}-lib-co = "MIT"
LICENSE_${PN}-lib-create-error-class = "MIT"
LICENSE_${PN}-lib-cryptiles = "BSD-3-Clause"
LICENSE_${PN}-lib-currently-unhandled = "MIT"
LICENSE_${PN}-lib-dashdash = "MIT"
LICENSE_${PN}-lib-decamelize = "MIT"
LICENSE_${PN}-lib-decompress-zip-isarray = "MIT"
LICENSE_${PN}-lib-decompress-zip-readable-stream = "MIT"
LICENSE_${PN}-lib-decompress-zip = "MIT"
LICENSE_${PN}-lib-deep-extend = "MIT"
LICENSE_${PN}-lib-delayed-stream = "MIT"
LICENSE_${PN}-lib-destroy = "MIT"
LICENSE_${PN}-lib-dot-prop = "MIT"
LICENSE_${PN}-lib-duplexer2 = "BSD-3-Clause"
LICENSE_${PN}-lib-ecc-jsbn = "Unknown MIT"
LICENSE_${PN}-lib-end-of-stream = "MIT"
LICENSE_${PN}-lib-ends-with = "MIT"
LICENSE_${PN}-lib-error-ex = "MIT"
LICENSE_${PN}-lib-escape-string-regexp = "MIT"
LICENSE_${PN}-lib-exit-hook = "MIT"
LICENSE_${PN}-lib-ext-list = "MIT"
LICENSE_${PN}-lib-ext-name = "MIT"
LICENSE_${PN}-lib-extend = "MIT"
LICENSE_${PN}-lib-extsprintf = "MIT"
LICENSE_${PN}-lib-figures = "MIT"
LICENSE_${PN}-lib-filled-array = "MIT"
LICENSE_${PN}-lib-find-up = "MIT"
LICENSE_${PN}-lib-findup-sync-glob = "ISC"
LICENSE_${PN}-lib-findup-sync = "MIT"
LICENSE_${PN}-lib-forever-agent = "Apache-2.0"
LICENSE_${PN}-lib-form-data = "MIT"
LICENSE_${PN}-lib-fs-write-stream-atomic = "ISC"
LICENSE_${PN}-lib-fs.realpath = "ISC"
LICENSE_${PN}-lib-fstream-ignore = "ISC"
LICENSE_${PN}-lib-fstream-minimist = "MIT"
LICENSE_${PN}-lib-fstream-mkdirp = "MIT"
LICENSE_${PN}-lib-fstream = "ISC"
LICENSE_${PN}-lib-generate-function = "MIT"
LICENSE_${PN}-lib-generate-object-property = "MIT"
LICENSE_${PN}-lib-get-stdin = "MIT"
LICENSE_${PN}-lib-getpass = "MIT"
LICENSE_${PN}-lib-github = "MIT"
LICENSE_${PN}-lib-glob-minimatch = "ISC"
LICENSE_${PN}-lib-glob = "ISC"
LICENSE_${PN}-lib-got = "MIT"
LICENSE_${PN}-lib-graceful-fs = "ISC"
LICENSE_${PN}-lib-handlebars-source-map = "BSD-3-Clause"
LICENSE_${PN}-lib-handlebars = "MIT"
LICENSE_${PN}-lib-har-schema = "ISC"
LICENSE_${PN}-lib-har-validator = "ISC"
LICENSE_${PN}-lib-has-ansi = "MIT"
LICENSE_${PN}-lib-hawk-hoek = "BSD-3-Clause"
LICENSE_${PN}-lib-hawk = "BSD-3-Clause"
LICENSE_${PN}-lib-hosted-git-info = "ISC"
LICENSE_${PN}-lib-http-signature-assert-plus = "MIT"
LICENSE_${PN}-lib-http-signature = "MIT"
LICENSE_${PN}-lib-iferr = "MIT"
LICENSE_${PN}-lib-imurmurhash = "MIT"
LICENSE_${PN}-lib-indent-string = "MIT"
LICENSE_${PN}-lib-inflight = "ISC"
LICENSE_${PN}-lib-inherits = "ISC"
LICENSE_${PN}-lib-ini = "ISC"
LICENSE_${PN}-lib-inquirer-lodash = "MIT"
LICENSE_${PN}-lib-inquirer = "MIT"
LICENSE_${PN}-lib-intersect = "MIT"
LICENSE_${PN}-lib-is-arrayish = "MIT"
LICENSE_${PN}-lib-is-buffer = "MIT"
LICENSE_${PN}-lib-is-builtin-module = "MIT"
LICENSE_${PN}-lib-is-finite = "MIT"
LICENSE_${PN}-lib-is-fullwidth-code-point = "MIT"
LICENSE_${PN}-lib-is-my-json-valid = "MIT"
LICENSE_${PN}-lib-is-npm = "MIT"
LICENSE_${PN}-lib-is-obj = "MIT"
LICENSE_${PN}-lib-is-plain-obj = "MIT"
LICENSE_${PN}-lib-is-property = "MIT"
LICENSE_${PN}-lib-is-redirect = "MIT"
LICENSE_${PN}-lib-is-retry-allowed = "MIT"
LICENSE_${PN}-lib-is-root = "MIT"
LICENSE_${PN}-lib-is-stream = "MIT"
LICENSE_${PN}-lib-is-typedarray = "MIT"
LICENSE_${PN}-lib-is-utf8 = "MIT"
LICENSE_${PN}-lib-isarray = "MIT"
LICENSE_${PN}-lib-isexe = "ISC"
LICENSE_${PN}-lib-isstream = "MIT"
LICENSE_${PN}-lib-jsbn = "MIT"
LICENSE_${PN}-lib-json-schema = "Unknown"
LICENSE_${PN}-lib-json-stable-stringify = "MIT"
LICENSE_${PN}-lib-json-stringify-safe = "ISC"
LICENSE_${PN}-lib-jsonify = "PD"
LICENSE_${PN}-lib-jsonpointer = "MIT"
LICENSE_${PN}-lib-jsprim = "MIT"
LICENSE_${PN}-lib-junk = "MIT"
LICENSE_${PN}-lib-kind-of = "MIT"
LICENSE_${PN}-lib-latest-version = "MIT"
LICENSE_${PN}-lib-lazy-cache = "MIT"
LICENSE_${PN}-lib-load-json-file = "MIT"
LICENSE_${PN}-lib-lockfile = "ISC"
LICENSE_${PN}-lib-lodash = "MIT"
LICENSE_${PN}-lib-longest = "MIT"
LICENSE_${PN}-lib-loud-rejection = "MIT"
LICENSE_${PN}-lib-lowercase-keys = "MIT"
LICENSE_${PN}-lib-lru-cache = "ISC"
LICENSE_${PN}-lib-map-obj = "MIT"
LICENSE_${PN}-lib-md5-hex = "MIT"
LICENSE_${PN}-lib-md5-o-matic = "MIT"
LICENSE_${PN}-lib-meow = "MIT"
LICENSE_${PN}-lib-mime-db = "MIT"
LICENSE_${PN}-lib-mime-types = "MIT"
LICENSE_${PN}-lib-mime = "MIT"
LICENSE_${PN}-lib-minimatch = "ISC"
LICENSE_${PN}-lib-minimist = "MIT"
LICENSE_${PN}-lib-mkdirp-minimist = "MIT"
LICENSE_${PN}-lib-mkdirp = "MIT"
LICENSE_${PN}-lib-mkpath = "MIT"
LICENSE_${PN}-lib-mout = "MIT"
LICENSE_${PN}-lib-mute-stream = "ISC"
LICENSE_${PN}-lib-nested-error-stacks = "MIT"
LICENSE_${PN}-lib-node-status-codes = "MIT"
LICENSE_${PN}-lib-node-uuid = "MIT"
LICENSE_${PN}-lib-nopt = "ISC"
LICENSE_${PN}-lib-normalize-package-data-semver = "ISC"
LICENSE_${PN}-lib-normalize-package-data = "BSD-2-Clause"
LICENSE_${PN}-lib-number-is-nan = "MIT"
LICENSE_${PN}-lib-oauth-sign = "Apache-2.0"
LICENSE_${PN}-lib-object-assign = "MIT"
LICENSE_${PN}-lib-once = "ISC"
LICENSE_${PN}-lib-onetime = "MIT"
LICENSE_${PN}-lib-opn = "MIT"
LICENSE_${PN}-lib-optimist-minimist = "MIT"
LICENSE_${PN}-lib-optimist-wordwrap = "MIT"
LICENSE_${PN}-lib-optimist = "MIT"
LICENSE_${PN}-lib-os-homedir = "MIT"
LICENSE_${PN}-lib-os-tmpdir = "MIT"
LICENSE_${PN}-lib-osenv = "ISC"
LICENSE_${PN}-lib-p-throttler-q = "MIT"
LICENSE_${PN}-lib-p-throttler = "MIT"
LICENSE_${PN}-lib-package-json-semver = "ISC"
LICENSE_${PN}-lib-package-json = "MIT"
LICENSE_${PN}-lib-parse-json = "MIT"
LICENSE_${PN}-lib-path-exists = "MIT"
LICENSE_${PN}-lib-path-is-absolute = "MIT"
LICENSE_${PN}-lib-path-parse = "MIT"
LICENSE_${PN}-lib-path-type = "MIT"
LICENSE_${PN}-lib-performance-now = "MIT"
LICENSE_${PN}-lib-pify = "MIT"
LICENSE_${PN}-lib-pinkie-promise = "MIT"
LICENSE_${PN}-lib-pinkie = "MIT"
LICENSE_${PN}-lib-prepend-http = "MIT"
LICENSE_${PN}-lib-process-nextick-args = "MIT"
LICENSE_${PN}-lib-promptly = "MIT"
LICENSE_${PN}-lib-pump = "MIT"
LICENSE_${PN}-lib-punycode = "MIT"
LICENSE_${PN}-lib-q = "MIT"
LICENSE_${PN}-lib-rc = "Unknown MIT"
LICENSE_${PN}-lib-read-all-stream = "MIT"
LICENSE_${PN}-lib-read-mute-stream = "ISC"
LICENSE_${PN}-lib-read-pkg-up = "MIT"
LICENSE_${PN}-lib-read-pkg = "MIT"
LICENSE_${PN}-lib-readable-stream-string-decoder = "MIT"
LICENSE_${PN}-lib-readable-stream = "MIT"
LICENSE_${PN}-lib-readline2 = "MIT"
LICENSE_${PN}-lib-read = "ISC"
LICENSE_${PN}-lib-redent = "MIT"
LICENSE_${PN}-lib-redeyed-esprima = "Unknown"
LICENSE_${PN}-lib-redeyed = "MIT"
LICENSE_${PN}-lib-registry-auth-token = "MIT"
LICENSE_${PN}-lib-registry-url = "MIT"
LICENSE_${PN}-lib-repeat-string = "MIT"
LICENSE_${PN}-lib-repeating = "MIT"
LICENSE_${PN}-lib-request-async = "MIT"
LICENSE_${PN}-lib-request-form-data = "MIT"
LICENSE_${PN}-lib-request-progress = "MIT"
LICENSE_${PN}-lib-request-qs = "BSD-3-Clause"
LICENSE_${PN}-lib-request-replay = "MIT"
LICENSE_${PN}-lib-request-tough-cookie = "BSD-3-Clause"
LICENSE_${PN}-lib-request = "Apache-2.0"
LICENSE_${PN}-lib-requireg-deep-extend = "MIT"
LICENSE_${PN}-lib-requireg-minimist = "MIT"
LICENSE_${PN}-lib-requireg-rc = "Unknown MIT"
LICENSE_${PN}-lib-requireg-resolve-test-resolver-biz-garply = "Unknown"
LICENSE_${PN}-lib-requireg-resolve = "MIT"
LICENSE_${PN}-lib-requireg-strip-json-comments = "MIT"
LICENSE_${PN}-lib-requireg-test-fixtures-lib-beaker = "Unknown"
LICENSE_${PN}-lib-requireg = "Unknown"
LICENSE_${PN}-lib-resolve = "MIT"
LICENSE_${PN}-lib-restore-cursor = "MIT"
LICENSE_${PN}-lib-retry = "Unknown"
LICENSE_${PN}-lib-right-align = "MIT"
LICENSE_${PN}-lib-rimraf-glob = "ISC"
LICENSE_${PN}-lib-rimraf = "ISC"
LICENSE_${PN}-lib-run-async = "MIT"
LICENSE_${PN}-lib-rx-lite = "Unknown"
LICENSE_${PN}-lib-safe-buffer = "MIT"
LICENSE_${PN}-lib-semver-diff-semver = "ISC"
LICENSE_${PN}-lib-semver-diff = "MIT"
LICENSE_${PN}-lib-semver-utils = "APACHEv2"
LICENSE_${PN}-lib-semver = "BSD"
LICENSE_${PN}-lib-shell-quote = "MIT"
LICENSE_${PN}-lib-signal-exit = "ISC"
LICENSE_${PN}-lib-slide = "ISC"
LICENSE_${PN}-lib-sntp-hoek = "BSD-3-Clause"
LICENSE_${PN}-lib-sntp = "Unknown"
LICENSE_${PN}-lib-sort-keys-length = "MIT"
LICENSE_${PN}-lib-sort-keys = "MIT"
LICENSE_${PN}-lib-spdx-correct = "Apache-2.0"
LICENSE_${PN}-lib-spdx-expression-parse = "MIT"
LICENSE_${PN}-lib-spdx-license-ids = "Unlicense"
LICENSE_${PN}-lib-sshpk = "MIT"
LICENSE_${PN}-lib-string-decoder = "MIT"
LICENSE_${PN}-lib-string-width = "MIT"
LICENSE_${PN}-lib-stringify-object = "MIT"
LICENSE_${PN}-lib-stringstream = "MIT"
LICENSE_${PN}-lib-strip-ansi = "MIT"
LICENSE_${PN}-lib-strip-bom = "MIT"
LICENSE_${PN}-lib-strip-indent = "MIT"
LICENSE_${PN}-lib-strip-json-comments = "MIT"
LICENSE_${PN}-lib-tar-fs-minimist = "MIT"
LICENSE_${PN}-lib-tar-fs-mkdirp = "MIT"
LICENSE_${PN}-lib-tar-fs = "MIT"
LICENSE_${PN}-lib-tar-stream-bl = "MIT"
LICENSE_${PN}-lib-tar-stream = "MIT"
LICENSE_${PN}-lib-throttleit = "MIT"
LICENSE_${PN}-lib-through = "Unknown MIT"
LICENSE_${PN}-lib-timed-out = "MIT"
LICENSE_${PN}-lib-tmp = "MIT"
LICENSE_${PN}-lib-touch-nopt = "MIT"
LICENSE_${PN}-lib-touch = "ISC"
LICENSE_${PN}-lib-traverse = "MIT"
LICENSE_${PN}-lib-trim-newlines = "MIT"
LICENSE_${PN}-lib-tunnel-agent = "Apache-2.0"
LICENSE_${PN}-lib-tweetnacl = "Unlicense"
LICENSE_${PN}-lib-uglify-js-source-map = "BSD-3-Clause"
LICENSE_${PN}-lib-uglify-js = "BSD-2-Clause"
LICENSE_${PN}-lib-uglify-to-browserify = "MIT"
LICENSE_${PN}-lib-untildify = "MIT"
LICENSE_${PN}-lib-unzip-response = "MIT"
LICENSE_${PN}-lib-update-notifier = "BSD-2-Clause"
LICENSE_${PN}-lib-url-parse-lax = "MIT"
LICENSE_${PN}-lib-user-home = "MIT"
LICENSE_${PN}-lib-util-deprecate = "MIT"
LICENSE_${PN}-lib-uuid = "MIT"
LICENSE_${PN}-lib-validate-npm-package-license = "Apache-2.0"
LICENSE_${PN}-lib-verror = "MIT"
LICENSE_${PN}-lib-which = "ISC"
LICENSE_${PN}-lib-widest-line = "MIT"
LICENSE_${PN}-lib-window-size = "MIT"
LICENSE_${PN}-lib-wrappy = "ISC"
LICENSE_${PN}-lib-write-file-atomic = "ISC"
LICENSE_${PN}-lib-xdg-basedir = "MIT"
LICENSE_${PN}-lib-xtend = "MIT"
LICENSE_${PN}-lib-yargs = "MIT"
LICENSE_${PN} = "MIT"


