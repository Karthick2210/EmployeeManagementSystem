package com.indus.los.ems.service;

import com.indus.los.ems.dao.EmployeeDao;
import com.indus.los.ems.dto.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    public Employee saveEmployee(Employee employee){
        return  employeeDao.saveEmployee(employee);
    }

    public Employee getEmployeeById(Long id){
        return employeeDao.getEmployee(id);
    }

    public List<Employee> getAllEmployees(){
        return  employeeDao.getAllEmployees();
    }
}
