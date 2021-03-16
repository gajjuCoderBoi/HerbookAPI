package com.cognizant.herobookapi.controller;

import com.cognizant.herobookapi.HeroService;
import com.cognizant.herobookapi.entity.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hero")
public class HeroController {

    @Autowired
    private HeroService heroService;

    @GetMapping("list")
    public ResponseEntity<List<Hero>> getAllHeros(@RequestParam String visitortag){
        return heroService.getAllHeros(visitortag);
    }

    @GetMapping("")
    public String getHeroByName(@RequestParam String visitortag, @RequestParam String heroName){

        return "{\"realName\":\"Henry Cavill\"}";

    }

}
