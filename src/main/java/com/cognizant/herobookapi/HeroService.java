package com.cognizant.herobookapi;

import com.cognizant.herobookapi.entity.Hero;
import com.cognizant.herobookapi.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    @PostConstruct
    void seedingDb(){
        heroRepository.save(new Hero("Superman","Henry Cavill"));
        heroRepository.save(new Hero("Batman","Ben Affleck"));
    }

    public ResponseEntity<List<Hero>> getAllHeros(String visitortag) {
        return visitortag.equals("galvanize") ?

                new ResponseEntity<List<Hero>>(heroRepository.findAll(), HttpStatus.OK)
                :
                new ResponseEntity<List<Hero>>(Collections.EMPTY_LIST, HttpStatus.UNAUTHORIZED);
    }

    private boolean isAuthorized(String tag){
        return tag.equals("galvanize");
    }

    public ResponseEntity<Hero> getHeroByName(String visitortag, String heroName) {

        if(isAuthorized(visitortag)){
            Hero savedHero = heroRepository.findByHeroName(heroName);
            return new ResponseEntity<Hero>(savedHero, HttpStatus.OK);
        }
        else
            return new ResponseEntity<Hero>(new Hero(), HttpStatus.UNAUTHORIZED);

    }
}
