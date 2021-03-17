package com.cognizant.herobookapi.controller;

import com.cognizant.herobookapi.dto.VillainDto;
import com.cognizant.herobookapi.service.VillainService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/villains")
public class VillainController {


    private VillainService villainService;

    @GetMapping
    public List<VillainDto> getAllVillains(){
        return villainService.getAllVillains();
    }

}
