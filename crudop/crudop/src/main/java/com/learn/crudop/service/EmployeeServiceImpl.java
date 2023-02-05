package com.learn.crudop.service;

import com.learn.crudop.exception.ResourceNotFoundException;
import com.learn.crudop.model.Employee;
import com.learn.crudop.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee getEmployee(long id) {
        return employeeRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("employee", "id", id));
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        Employee employee1 = employeeRepo.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("not found employee", "id", id));
        employee1.setFname(employee.getFname());
        employee1.setLname(employee.getLname());
        employee1.setEmail(employee.getEmail());
       return employeeRepo.save(employee1);
    }

    @Override
    public void deleteEmployee(long id) {
        Employee employee1 = employeeRepo.findById(id).orElseThrow(
                ()->new ResourceNotFoundException("not found employee", "id", id));
        employeeRepo.deleteById(id);
    }

}
