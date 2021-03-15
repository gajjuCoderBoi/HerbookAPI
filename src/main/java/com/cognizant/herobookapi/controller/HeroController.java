package com.cognizant.herobookapi.controller;

import com.cognizant.herobookapi.HeroService;
import com.cognizant.herobookapi.entity.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping("list")
    public List<Hero> getAllHeros(){

        return heroService.getAllHeros();
    }

}
