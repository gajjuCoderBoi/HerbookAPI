package com.cognizant.herobookapi.repository;

import com.cognizant.herobookapi.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface HeroRepository extends JpaRepository<Hero, UUID> {

    public Hero findByHeroName(String name);
}
