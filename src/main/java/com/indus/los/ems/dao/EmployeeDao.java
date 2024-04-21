package com.indus.los.ems.dao;

import com.indus.los.ems.dto.Employee;
import com.indus.los.ems.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDao {

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){

        return  employeeRepository.save(employee);
    }

    public Employee getEmployee(Long id){

        Optional<Employee> employee =  employeeRepository.findById(id);

        return employee.orElse(null);

    }

    public List<Employee> getAllEmployees(){

        return  employeeRepository.findAll();
    }


}
