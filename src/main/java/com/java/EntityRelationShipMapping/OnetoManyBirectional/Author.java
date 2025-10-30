package com.java.EntityRelationShipMapping.OnetoManyBirectional;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "demo-author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "author")
    private List<Book>books;

}
/*(for this Use Case(

    Author    Book
       1       M
       1       1
 */