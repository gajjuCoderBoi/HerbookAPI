package com.cognizant.herobookapi.controller;

import com.cognizant.herobookapi.entity.Hero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroController {

    @GetMapping("list")
    public List<Hero> getAllHeros(){
        List<Hero> list = new ArrayList<>();
        list.add(new Hero("Superman"));
        list.add(new Hero("Batman"));
        return list;
    }

}
