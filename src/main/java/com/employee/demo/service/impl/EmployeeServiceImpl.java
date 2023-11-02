package com.employee.demo.service.impl;

import com.employee.demo.entity.Employee;
import com.employee.demo.repository.EmployeeRepository;
import com.employee.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Optional<Employee> employee1 = employeeRepository.findById(id);
        Employee employee2 = employee1.get();
        Employee employee3 = new Employee();
        employee3.setId(employee2.getId());
        employee3.setFirstName(employee.getFirstName());
        employee3.setLastName(employee.getLastName());
        employee3.setEmail(employee.getEmail());
        employee3.setAge(employee.getAge());

        return employeeRepository.save(employee3);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }
}
