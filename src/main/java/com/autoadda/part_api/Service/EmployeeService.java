package com.autoadda.part_api.Service;


import com.autoadda.part_api.Repository.EmployeeRepository;
import com.autoadda.part_api.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // Get employee by ID
    public Optional<Employee> getEmployeeById(Integer id) {
        return repository.findById(id);
    }

    // Create new employee
    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    // Update existing employee
    public Employee updateEmployee(Integer id, Employee employeeDetails) {
        Employee employee = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmail(employeeDetails.getEmail());
        employee.setPhone(employeeDetails.getPhone());
        employee.setAge(employeeDetails.getAge());
        employee.setAddress(employeeDetails.getAddress());
        return repository.save(employee);
    }

    // Delete employee
    public void deleteEmployee(Integer id) {
        repository.deleteById(id);
    }
}
