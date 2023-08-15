package com.magi.vmprovisioningsystem.repository;

import com.magi.vmprovisioningsystem.entitiy.User;
import com.magi.vmprovisioningsystem.entitiy.VirtualMachine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VirtualMachineRepository extends JpaRepository<VirtualMachine, Long> {
    List<VirtualMachine> findByOwner(User owner);
}