package com.cognizant.herobookapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Hero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hero_id")
    private UUID id;

    @Column(name = "hero_name")
    private String name;

    public Hero(String name) {
        this.name = name;
    }
}
