package com.java.Connectivity.Service.JDBC;

import com.java.Connectivity.Model.Employee;
import com.java.Connectivity.Repository.JDBC.JDBCEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JDBCService {

    @Autowired
    public JDBCEmployeeRepository jdbcEmployeeRepository;

    public Employee findByNameAndDepartment(String name , String department){
        return jdbcEmployeeRepository.findByNameAndDepartment(name,department);
    }

}
