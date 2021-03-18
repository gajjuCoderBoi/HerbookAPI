package com.cognizant.herobookapi.service;

import com.cognizant.herobookapi.entity.Favourite;
import com.cognizant.herobookapi.entity.Hero;
import com.cognizant.herobookapi.repository.FavouriteRepository;
import com.cognizant.herobookapi.repository.HeroRepository;
import com.cognizant.herobookapi.response.CustomMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.List;

@Service
public class FavouriteService {

    @Autowired
    private FavouriteRepository favouriteRepository;

/*    @PostConstruct
    void seedingDb(){
        heroRepository.save(new Hero("Superman","Henry Cavill"));
        heroRepository.save(new Hero("Batman","Ben Affleck"));
    }*/

    public ResponseEntity<List<Favourite>> getUserFavourites(String username){
        return new ResponseEntity<List<Favourite>>(Collections.EMPTY_LIST, HttpStatus.CREATED);
    }
}
