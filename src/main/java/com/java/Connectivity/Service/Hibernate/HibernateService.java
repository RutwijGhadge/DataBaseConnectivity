package com.java.Connectivity.Service.Hibernate;

import com.java.Connectivity.Model.Employee;
import com.java.Connectivity.Repository.Hibernate.HibernateEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HibernateService {

    @Autowired
    private HibernateEmployeeRepo hibernateEmployeeRepo;

    public Employee getHibernateQueryResult(String name , String department){
        return hibernateEmployeeRepo.findByNameAndDepartment(name,department);
    }
}
