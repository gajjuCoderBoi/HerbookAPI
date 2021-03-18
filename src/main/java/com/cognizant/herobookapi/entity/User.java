package com.cognizant.herobookapi.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
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

    public User(String name, Role role){
        this.username = name;
        this.role = role;

    }
}
