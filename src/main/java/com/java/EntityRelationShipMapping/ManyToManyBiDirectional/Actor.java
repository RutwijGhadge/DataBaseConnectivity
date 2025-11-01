package com.java.EntityRelationShipMapping.ManyToManyBiDirectional;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "demo-actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private List<Movie> movies;
}
