package com.java.Connectivity.Service.SpringDataJPA;
import com.java.Connectivity.Model.Employee;
import com.java.Connectivity.Repository.SpringDataJPA.SpringDataJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SpringDataJPAService {

    @Autowired
    private SpringDataJPARepository springDataJPARepository;

    public Employee findByNameAndDepartment(String name , String department){
      return springDataJPARepository.findByNameAndDepartment(name,department);
    }

}
