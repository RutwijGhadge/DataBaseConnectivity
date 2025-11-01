package com.java.EntityRelationShipMapping.ManyToManyBiDirectional;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "demo-movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(mappedBy = "movies")
    private List<Actor> actorList;
}
