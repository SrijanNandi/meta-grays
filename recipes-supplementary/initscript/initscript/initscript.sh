#!/bin/sh

logger "Starting basic configuration"

# do some work here. Mount rootfs as rw if needed.
SURICATA_CONF_FILE="/etc/suricata/suricata.yaml"
INT_NAME=`ip link | awk -F: '$0 !~ "lo|vir|wl|^[^0-9]"{print $2;getline}' | sort | uniq -D -w3`
INT_COUNT=`ip link | awk -F: '$0 !~ "lo|vir|wl|^[^0-9]"{print $2;getline}' | sort | uniq -D -w3 | wc -l`
PROC_COUNT=`/usr/bin/nproc --all`

declare -a array=($(echo "$INT_NAME" | tr ' ' '\n'))

ITER=1
THREADS_COUNT=$(($PROC_COUNT-2))
for ((i=0; i<${#array[@]}; i+=2)); do
   TMP_FILE="/tmp/suricata.temp$i"
   cat << 'EOF' > $TMP_FILE
  - interface: FIRST_INT
    threads: THREADS_COUNT
    cluster-id: FIRST_ID
    defrag: no
    cluster-type: cluster_flow
    #xdp-mode: driver
    #xdp-filter-file:  /etc/suricata/ebpf/xdp_filter.bpf
    bypass: yes
    copy-mode: ips
    use-mmap: yes
    #ring-size: 500000
    #buffer-size: 5368709120
    rollover: no
    use-emergency-flush: yes
    copy-iface: SECOND_INT
  - interface: SECOND_INT
    threads: THREADS_COUNT
    cluster-id: SECOND_ID
    defrag: no
    cluster-type: cluster_flow
    #xdp-mode: driver
    #xdp-filter-file:  /etc/suricata/ebpf/xdp_filter.bpf
    bypass: yes
    copy-mode: ips
    use-mmap: yes
    #ring-size: 500000
    #buffer-size: 5368709120
    rollover: no
    use-emergency-flush: yes
    copy-iface: FIRST_INT
EOF
   sed -i "s/- interface: FIRST_INT/- interface: ${array[$i]}/g" $TMP_FILE
   sed -i "s/cluster-id: FIRST_ID/cluster-id: $(expr 99 - $ITER)/g" $TMP_FILE
   sed -i "s/copy-iface: SECOND_INT/copy-iface: "${array[$i+1]}"/g" $TMP_FILE
   sed -i "s/- interface: SECOND_INT/- interface: "${array[$i+1]}"/g" $TMP_FILE
   sed -i "s/cluster-id: SECOND_ID/cluster-id: $(expr 99 - $ITER - 1)/g" $TMP_FILE
   sed -i "s/copy-iface: FIRST_INT/copy-iface: "${array[$i]}"/g" $TMP_FILE 
   sed -i "s/threads: THREADS_COUNT/threads: $THREADS_COUNT/g" $TMP_FILE
   ITER=$(expr $ITER + 2)

done
cat /tmp/suricata.temp* >> /tmp/newfile.temp

if [ -f $SURICATA_CONF_FILE ]; then
   cp -r /etc/suricata/suricata.yaml /etc/suricata/suricata.yaml.ORIG
fi

sed -i "/AF_PACKET/ e cat /tmp/newfile.temp" $SURICATA_CONF_FILE
sed -i '/AF_PACKET/d' $SURICATA_CONF_FILE
rm -rf /tmp/suricata.temp*
rm -rf /tmp/newfile.temp*

logger "Configuration done"

#job done, remove it from systemd services
systemctl disable initscript.service
