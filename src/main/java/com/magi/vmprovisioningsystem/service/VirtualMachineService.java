package com.magi.vmprovisioningsystem.service;

import com.magi.vmprovisioningsystem.entitiy.User;
import com.magi.vmprovisioningsystem.entitiy.VirtualMachine;
import com.magi.vmprovisioningsystem.repository.VirtualMachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VirtualMachineService {
    @Autowired
    private VirtualMachineRepository vmRepository;

    public VirtualMachine createVM(VirtualMachine vm) {
        return vmRepository.save(vm);
    }

    public List<VirtualMachine> getUserVMs(User user) {
        return vmRepository.findByOwner(user);
    }

    public void deleteVM(Long id) {
        vmRepository.deleteById(id);
    }

}
