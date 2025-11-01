package com.java.EntityRelationShipMapping.OneToManyUniDirectional;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "Demo-School")
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "School_id")
    private List<Classroom> classroomList;
    /*
     Join Column -> className_columnName
     If we Didn't provide @JoinColumn Annotation then separate table will be created with School_id and Classroom_id
     To avoid this we will just add the @JoinColumn Annotation

     Classroom table will have school_id.
     school table will have school_id column only.
     */
}
