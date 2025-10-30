package com.java.EntityRelationShipMapping.OnetoOneBidirectional;

import jakarta.persistence.*;

@Entity(name = "Demo-License")
public class License {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String LicenseNumber;

    @OneToOne
    private Driver driver;

}
