package com.java.Connectivity.Model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="employee")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "dep")
    private String department;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


/*
JDBC will not consider the Annotations @Table , @Data
that is why we have to write Explicit mapper to return the result in proper format

Disadvantages of JDBC :
 We have to explicitly write Mapping Object to Entity
 Transaction Management is Not Supported.

 So here Hibernate Comes into Picture. (Implementation of JPA)
 1. Hibernate is an ORM tool : its do the Object Relational Mapping provides you by Default.(with the help Annotations)
 Hibernate and JPA go hand in hand.

 */