package com.java.EntityRelationShipMapping.OneToOneBiDirectional;

import jakarta.persistence.*;

@Entity(name = "Demo-Driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "driver")
    private License license;
    //Each driver has a unique License
}
/*
    Driver - License
    Driver will have a License
    Every License will be associated with a Driver
    So Bidirectional Mapping


    Mapped by=driver Indicates the Primary key of Driver table goes to License Table
 */