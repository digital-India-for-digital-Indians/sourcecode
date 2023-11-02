package com.employee.demo.service;

import com.employee.demo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    Employee addEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Optional<Employee> getEmployeeById(Long id);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployeeById(Long id);
}
