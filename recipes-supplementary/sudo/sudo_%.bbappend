# Finalize sudo accesses for Authorized users
#

do_install_append () {
    install -d -m 0710 "${D}/etc/sudoers.d"
    touch "${D}/etc/sudoers.d/001_first"
    echo "graylogadmin ALL=(ALL) ALL" > ${D}${sysconfdir}/sudoers.d/001_first
    chmod 0644 "${D}/etc/sudoers.d/001_first"
}

FILES_${PN} +=  "/etc/sudoers.d \
               /etc/sudoers.d/0001_first"
