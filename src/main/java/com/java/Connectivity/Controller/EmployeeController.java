package com.java.Connectivity.Controller;

import com.java.Connectivity.Model.Employee;
import com.java.Connectivity.Repository.SpringDataJPA.SpringDataJPARepository;
import com.java.Connectivity.Service.Hibernate.HibernateService;
import com.java.Connectivity.Service.JDBC.JDBCService;
import com.java.Connectivity.Service.JPA.JPAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private JDBCService jdbcService;

    @Autowired
    private HibernateService hibernateService;

    @Autowired
    private JPAService jpaService;

    @Autowired
    private SpringDataJPARepository dataJPARepository;

    @GetMapping("/jdbc")
    public Employee getResultViaJDBC(@RequestParam String name,@RequestParam String department){
        return jdbcService.findByNameAndDepartment(name,department);
    }

    @GetMapping("/hibernate")
    public Employee getResultViaHibernate(@RequestParam String name,@RequestParam String department){
        return hibernateService.getHibernateQueryResult(name,department);
    }

    @GetMapping("/jpa")
    public Employee getResultViaJpa(@RequestParam String name,@RequestParam String department){
        return jpaService.getJPAResult(name,department);
    }

    @GetMapping("/springDataJpa")
    public Employee getResultViaSpringDataJpa(@RequestParam String name,@RequestParam String department){
        return dataJPARepository.findByNameAndDepartment(name,department);
    }

}
