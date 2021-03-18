package com.cognizant.herobookapi.service;

import com.cognizant.herobookapi.entity.Favourite;
import com.cognizant.herobookapi.entity.Hero;
import com.cognizant.herobookapi.entity.User;
import com.cognizant.herobookapi.repository.FavouriteRepository;
import com.cognizant.herobookapi.repository.HeroRepository;
import com.cognizant.herobookapi.repository.UserRepository;
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

    @Autowired
    private UserRepository userRepository;

/*    @PostConstruct
    void seedingDb(){
        heroRepository.save(new Hero("Superman","Henry Cavill"));
        heroRepository.save(new Hero("Batman","Ben Affleck"));
    }*/

    public ResponseEntity<Favourite> createUserFavourites(String username, String favouriteName){

        User savedUser = userRepository.findByUsername(username);
        Favourite favourite = new Favourite();
        favourite.setFavouriteName(favouriteName);
        favourite.setFavouriteHeroList(Collections.EMPTY_LIST);
        favourite.setUser(savedUser);

        Favourite savedFavourite = favouriteRepository.save(favourite);

        //return new ResponseEntity<List<Favourite>>(Collections.EMPTY_LIST, HttpStatus.CREATED);

        return new ResponseEntity<>(savedFavourite, HttpStatus.CREATED);

    }
}
