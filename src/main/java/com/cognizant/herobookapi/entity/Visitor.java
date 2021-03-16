package com.cognizant.herobookapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
public class Visitor {

    public Visitor(String name, String tag) {
        this.name = name;
        this.tag = tag;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "visitor_id")
    private UUID ID;

    @Column(name = "visitor_name")
    private String name;

    @Column(name = "visitor_tag")
    private String tag;
}
