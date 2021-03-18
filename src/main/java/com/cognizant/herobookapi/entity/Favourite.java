package com.cognizant.herobookapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Favourite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "favourite_id")
    private UUID id;

    @Column(name = "favourite_name")
    private String favouriteName;

    @ManyToMany
    @JoinTable(name = "user_favourites",
            joinColumns = {@JoinColumn(name = "favourite_id")},
            inverseJoinColumns = {@JoinColumn(name = "user_id")})
    private List<Hero> favouriteHeroList;


}
