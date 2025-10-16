package com.java.Connectivity.Repository.JPA;
import com.java.Connectivity.Model.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JPARepository {

    @Autowired
    private EntityManager entityManager;

    public Employee findByNameAndDepartment(String name,String department){
        String jpaQl="FROM Employee WHERE name=:name AND department= :department";
        return entityManager.createQuery(jpaQl,Employee.class)
                .setParameter("name",name)
                .setParameter("department",department)
                .getSingleResult();
    }

}
/*
JpaRepository (Interface) is a part of Spring Data JPA and not the Core JPA.
JPARepository (CLASS) is using EntityManager interface.
 */