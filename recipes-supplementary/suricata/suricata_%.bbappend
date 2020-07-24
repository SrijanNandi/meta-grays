SYSTEMD_SERVICE_${PN} = "suricata.service"
SYSTEMD_AUTO_ENABLE_${PN} = "disable"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://suricata.service"
