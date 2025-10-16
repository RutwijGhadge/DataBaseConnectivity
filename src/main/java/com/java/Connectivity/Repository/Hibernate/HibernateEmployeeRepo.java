package com.java.Connectivity.Repository.Hibernate;

import com.java.Connectivity.Model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateEmployeeRepo {

    @Autowired
    private SessionFactory sessionFactory;

    public Employee findByNameAndDepartment(String name , String department){
        try(Session session= sessionFactory.openSession()){  //One drawback of Hibernate -> We have to deal with the session
            String hsql= "FROM Employee WHERE name= :name AND department= :department";
            return session.createQuery(hsql,Employee.class)
                    .setParameter("name",name)
                    .setParameter("department",department)
                    .uniqueResult();
        }
    }

}
/*
1. Parameters are passed with the :
example-> :name , :department

2.Hibernate deals with the class attributes and not the table columns
in the Query we are giving Employee class and not the table employee

Hibernate is an ORM Tool but there were other tools as well and all of them had different implementations.
So , It needed , it was difficult to switch among them.
so to solve this problem -> JPA is used.
JPA defines a standard set of Methods that are to be implemented by these ORM tools.

 */