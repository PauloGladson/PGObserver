# -*- mode: ruby -*-
# vi: set ft=ruby :

# Vagrantfile API/syntax version. Don't touch unless you know what you're doing!
VAGRANTFILE_API_VERSION = "2"

Vagrant.configure(VAGRANTFILE_API_VERSION) do |config|

    config.vm.box = "ubuntu-trusty-14.04-cloudimg"
    config.vm.box_url = "https://cloud-images.ubuntu.com/vagrant/trusty/current/trusty-server-cloudimg-amd64-vagrant-disk1.box"

    config.vm.hostname = "pgobserver"

    # Frontend
    config.vm.network :forwarded_port, guest: 8080, host: 38080
    # Gatherer
    config.vm.network :forwarded_port, guest: 8182, host: 38081

    config.vm.provider "virtualbox" do |vb|
        vb.customize ["modifyvm", :id, "--memory", "2048"]
    end

    config.vm.provision "shell", path: "vagrant/setup.sh"
    config.vm.provision "shell", path: "vagrant/build.sh"
    config.vm.provision "shell", path: "vagrant/start.sh"

end