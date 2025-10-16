package com.java.Connectivity.Repository.SpringDataJPA;

import com.java.Connectivity.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJPARepository extends JpaRepository<Employee,Long> {
    Employee findByNameAndDepartment(String name, String department);
}

/*
Spring Data JPA is a Module i.e It's a Spring Boot Project which was introduced to reduce even more boilerplate
Acts a further Abstraction Layer on JPA

Employee findByNameAndDepartment(String name, String department)-> this is a derived query
Derived Queries in Spring Data JPA auto-generate SQL from method names we define.
 */