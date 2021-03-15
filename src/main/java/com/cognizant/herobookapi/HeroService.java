package com.cognizant.herobookapi;

import com.cognizant.herobookapi.entity.Hero;
import com.cognizant.herobookapi.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;

    @PostConstruct
    void init(){
        heroRepository.save(new Hero("Superman"));
        heroRepository.save(new Hero("Batman"));
    }

    public List<Hero> getAllHeros() {
        return heroRepository.findAll();
    }
}
