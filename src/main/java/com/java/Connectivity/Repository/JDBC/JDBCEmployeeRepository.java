package com.java.Connectivity.Repository.JDBC;

import com.java.Connectivity.Model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class JDBCEmployeeRepository {

    @Autowired
    public JdbcTemplate jdbcTemplate; //this is imp to use while going with JDBC

    public Employee findByNameAndDepartment(String name , String department){
        String sql = "SELECT * FROM employee WHERE name = ? AND dep = ?";
        return jdbcTemplate.queryForObject(sql, new EmployeeRowMapper(), name, department);
    }

}

class EmployeeRowMapper implements RowMapper<Employee>{

    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee emp=new Employee();
        emp.setId(rs.getLong("id"));
        emp.setName(rs.getString("name"));
        emp.setDepartment(rs.getString("dep"));

        return emp;
    }
}

/*
JDBC deals with the Table columns and not the class Attributes
we have to map the class attributes to Table columns explicitly.
 */