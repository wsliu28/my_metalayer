# Commands used in git:
- git clone $(repositories path) (to copy all files from repositories}
- git checkout -b $(branch) (to checkout and go to the branch)
- git branch (to show the current branch)
- git status (to show the current status)
- git add . or git add $(filenames)
- git commit -m " description "
- git push
- git fetch && git pull (to sync the files in a git repository)

# Commands used in bitbake:
- bitbake -e ${recipe name} | grep ^COREBASE= (to check the COREBASE path (ie poky dir) )
- md5sum COPYING.MIT (to get the checksum)
- bitbake -c listtasks ${recipe name}
- bitbake -e ${recipe name} | grep ^FILESEXTRAPATHS= (to find the FILESEXTRAPATHS of the recipe)


# SDK:
- bitbake -c do_populate_sdk core-image-full-cmdline
- go to ....tmp/deploy/sdk
- ./poky-glibc-x86_64-core-image-full-cmdline-cortexa8hf-neon-beaglebone-yocto-toolchain-4.0.23.sh
- enter the sdk dir path



# sysd config added in local.conf:
- DISTRO_FEATURES:append = " systemd"
- VIRTUAL-RUNTIME_init_manager = "systemd"
- DISTRO_FEATURES_BACKFILL_CONSIDERED += "sysvinit"
- VIRTUAL-RUNTIME_initscripts = "systemd-compat-units"


# Installed recipes (add to local.conf):
- For examples:
- IMAGE_INSTALL:append = " libstdc++"
- IMAGE_INSTALL:append = " python3"
- IMAGE_INSTALL:append = " maintest2"
- IMAGE_INSTALL:append = " git"
- IMAGE_INSTALL:append = " helloworld"
- IMAGE_INSTALL:append = " maintestmake"
- IMAGE_INSTALL:append = " testcmake"
- IMAGE_INSTALL:append = " sysdtest"


# Add development libraries in /usr/lib:
- EXTRA_IMAGE_FEATURES += "tools-sdk"
- EXTRA_IMAGE_FEATURES += "tools-debug"

# Setup for yocto project
- sudo apt install gawk wget git diffstat unzip texinfo gcc build-essential chrpath socat cpio python3 python3-pip python3-pexpect xz-utils debianutils iputils-ping python3-git python3-jinja2 libegl1-mesa libsdl1.2-dev pylint xterm python3-subunit mesa-common-dev zstd liblz4-tool (to install and setup the linux environment)
- git clone -b kirkstone git://git.yoctoproject.org/poky.git (to download poky)
- cd poky; source oe-init-build-env (to build)
- sudo nano conf/local.conf (to modify the building configuration)
- bitbake core-image-full-cmdline
- or bitbake core-image-full-cmdline -c cleanall && bitbake core-image-full-cmdline

# Prepare SD card
- ls -ltr /dev/ | grep -i sd (to see the sd status)
- sudo dd if=/dev/zero of=/dev/sd{disk} bs=1M count=16 (to remove partition)
- sudo cfdisk /dev/sd{disk}, setect DOS, select new, 128M (1st partition), Type=(e)FAT16, Bootable (to form 1st partition)
- select new, Type=(83)Linux, write=yes, quit (to form 2nd partition)
- cat /proc/partitions | grep sd{disk} to view partition
- sudo mkfs.vfat -F 32 -n BOOT /dev/sd{disk}1  (to format partition1)
- sudo mkfs.ext3 -L ROOTFS -E nodiscard /dev/sd{disk}2 (to format partition2) or sudo mkfs.ext4 -L ROOTFS -E nodiscard /dev/sd{disk}2 (to format partition2)

# Linux Commands
- lsb_release -da (check linux version)
- modinfo {driver name}.ko (display a driver details)
- lsmod or lsmod | grep {driver name} (list a driver in the kernel)
- sudo dmesg | tail
- sudo dmesg -w (to see the new coming kernel log)
- sudo mknod {driver_interface_name} maj_num min_num (make a interface node to a driver)
- ls -al /dev/tty* (to list the dev/tty* with major and minar numbers)
- 
- 





