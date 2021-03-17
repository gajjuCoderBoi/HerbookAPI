package com.cognizant.herobookapi.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private UUID id;

    @Column(name="username")
    private String username;

    @OneToOne
    @PrimaryKeyJoinColumn
    private Role role;
}
