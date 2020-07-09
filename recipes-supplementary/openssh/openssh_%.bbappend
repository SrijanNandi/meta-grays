SUMMARY = "A suite of security-related network utilities based on \
the SSH protocol including the ssh client and sshd server"
DESCRIPTION = "Secure rlogin/rsh/rcp/telnet replacement (OpenSSH) \
Ssh (Secure Shell) is a program for logging into a remote machine \
and for executing commands on a remote machine."

do_install_append () {
        sed -i 's/#Port 22/Port 2224/' ${D}${sysconfdir}/ssh/sshd_config
        sed -i 's/#ListenAddress 0.0.0.0/ListenAddress 0.0.0.0/' ${D}${sysconfdir}/ssh/sshd_config 
        sed -i 's/#LogLevel INFO/LogLevel INFO/' ${D}${sysconfdir}/ssh/sshd_config
}

SYSTEMD_AUTO_ENABLE = "disable"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
