package com.magi.vmprovisioningsystem.controller;

import com.magi.vmprovisioningsystem.entitiy.User;
import com.magi.vmprovisioningsystem.entitiy.VirtualMachine;
import com.magi.vmprovisioningsystem.service.UserService;
import com.magi.vmprovisioningsystem.service.VirtualMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private VirtualMachineService vmService;

    @Autowired
    private UserService userService;

    @GetMapping("/vms")
    public List<VirtualMachine> getUserVMs() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User user = userService.getUserByUsername(username);
        return vmService.getUserVMs(user);
    }

    @PostMapping("/create-vm")
    public VirtualMachine createVM(@RequestBody VirtualMachine vm) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();
        User user = userService.getUserByUsername(username);
        vm.setOwner(user);
        return vmService.createVM(vm);
    }
}
