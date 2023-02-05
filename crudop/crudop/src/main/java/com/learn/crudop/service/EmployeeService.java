package com.learn.crudop.service;

import com.learn.crudop.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService{
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployee();
    Employee getEmployee(long id);

    Employee updateEmployee(long id, Employee employee);

    void deleteEmployee(long id);
}
