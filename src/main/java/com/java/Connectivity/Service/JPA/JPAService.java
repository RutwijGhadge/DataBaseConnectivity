package com.java.Connectivity.Service.JPA;

import com.java.Connectivity.Model.Employee;
import com.java.Connectivity.Repository.JPA.JPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JPAService {

    @Autowired
    private JPARepository jpaRepository;

    public Employee getJPAResult(String name , String department){
        return jpaRepository.findByNameAndDepartment(name,department);
    }

}
