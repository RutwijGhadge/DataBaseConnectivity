package com.java.EntityRelationShipMapping.OneToManyBiDirectional;
import jakarta.persistence.*;

@Entity(name = "demo-book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    private Author author;
}

