package com.cognizant.herobookapi.repository;

import com.cognizant.herobookapi.entity.Villain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface VillainRepository extends JpaRepository<Villain, UUID> {

}
