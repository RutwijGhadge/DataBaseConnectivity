package com.java.EntityRelationShipMapping.ManyToManyUniDirectional;

import jakarta.persistence.*;

import java.util.List;


@Entity(name="demo-course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    private List<Student> studentList;
}
