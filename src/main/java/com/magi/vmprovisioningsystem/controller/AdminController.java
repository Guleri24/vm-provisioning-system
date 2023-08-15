package com.magi.vmprovisioningsystem.controller;

import com.magi.vmprovisioningsystem.entitiy.VirtualMachine;
import com.magi.vmprovisioningsystem.service.VirtualMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private VirtualMachineService vmService;

    @PostMapping("/create-vm")
    public VirtualMachine createVM(@RequestBody VirtualMachine vm) {
        return vmService.createVM(vm);
    }

    @DeleteMapping("/delete-vm/{id}")
    public void deleteVM(@PathVariable Long id) {
        vmService.deleteVM(id);
    }
}
