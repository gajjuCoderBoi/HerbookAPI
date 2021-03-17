package com.cognizant.herobookapi.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class Villain {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "villain_id")
    private UUID id;

    @Column(name = "villain_name") private String villainName;

    @Column(name = "real_name") private String realName;

}
