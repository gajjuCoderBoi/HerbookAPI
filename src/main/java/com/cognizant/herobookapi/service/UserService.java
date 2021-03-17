package com.cognizant.herobookapi.service;

import com.cognizant.herobookapi.entity.Role;
import com.cognizant.herobookapi.entity.User;
import com.cognizant.herobookapi.repository.RoleRepository;
import com.cognizant.herobookapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @PostConstruct
    void seedDB(){
        Role visitorRole = roleRepository.save(new Role("visitor"));
        Role fanRole = roleRepository.save(new Role("fan"));
        Role managerRole = roleRepository.save(new Role("manager"));

        userRepository.save(new User("mohammad",visitorRole));
        userRepository.save(new User("iqbal",fanRole));
        userRepository.save(new User("david",managerRole));
        userRepository.save(new User("wes",managerRole));
    }
}
