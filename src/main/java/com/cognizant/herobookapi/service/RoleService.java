package com.cognizant.herobookapi.service;

import com.cognizant.herobookapi.entity.Role;
import com.cognizant.herobookapi.entity.Villain;
import com.cognizant.herobookapi.repository.RoleRepository;
import com.cognizant.herobookapi.repository.VillainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

   /* @PostConstruct
    void seedDB(){
        roleRepository.save(new Role("visitor"));
        roleRepository.save(new Role("fan"));
        roleRepository.save(new Role("manager"));
    }*/
}
