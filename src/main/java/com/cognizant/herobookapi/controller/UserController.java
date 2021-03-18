package com.cognizant.herobookapi.controller;

import com.cognizant.herobookapi.entity.Favourite;
import com.cognizant.herobookapi.entity.Hero;
import com.cognizant.herobookapi.service.FavouriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    FavouriteService favouriteService;

    //("/users/favourite")

    @PostMapping("/favourite")
    public ResponseEntity<Favourite> createFavourite(@RequestParam String username,
                                                         @RequestParam String favouriteName){
        return favouriteService.createUserFavourites(username, favouriteName);
    }
}
