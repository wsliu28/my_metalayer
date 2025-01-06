#Commands used in git:
#git clone $(repositories path) (to copy all files from repositories}
#git checkout -b $(branch) (to checkout and go to the branch)
#git branch (to show the current branch)
#git status (to show the current status)
#git add . or git add $(filenames)
#git commit -m " description "
#git push
#git fetch && git pull (to sync the files in a git repository)

#Commands used in bitbake:
#bitbake -e ${recipe name} | grep ^COREBASE= (to check the COREBASE path (ie poky dir) )
#md5sum COPYING.MIT (to get the checksum)
#bitbake -c listtasks ${recipe name}
#bitbake -e ${recipe name} | grep ^FILESEXTRAPATHS= (to find the FILESEXTRAPATHS of the recipe)


#SDK:
#bitbake -c do_populate_sdk core-image-full-cmdline


sysd config added in local.conf:

DISTRO_FEATURES:append = " systemd"
VIRTUAL-RUNTIME_init_manager = "systemd"
DISTRO_FEATURES_BACKFILL_CONSIDERED += "sysvinit"
VIRTUAL-RUNTIME_initscripts = "systemd-compat-units"


Installed recipes (add to local.conf):
For examples:
IMAGE_INSTALL:append = " libstdc++"
IMAGE_INSTALL:append = " python3"
IMAGE_INSTALL:append = " maintest2"
IMAGE_INSTALL:append = " git"
IMAGE_INSTALL:append = " helloworld"
IMAGE_INSTALL:append = " maintestmake"
IMAGE_INSTALL:append = " testcmake"
IMAGE_INSTALL:append = " sysdtest"


Add development libraries in /usr/lib:
EXTRA_IMAGE_FEATURES += "tools-sdk"
EXTRA_IMAGE_FEATURES += "tools-debug"







