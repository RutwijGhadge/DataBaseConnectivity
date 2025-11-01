package com.java.EntityRelationShipMapping.OneToOneUniDirectional;

import jakarta.persistence.*;


@Entity(name = "Demo-User")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private UserProfile userProfile;
}
