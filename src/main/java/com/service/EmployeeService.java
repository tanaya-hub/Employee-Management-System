package com.service;

import java.util.List;
import com.entity.Employee;

public interface EmployeeService {

    Employee addEmployee(Employee employee);

    Employee getEmployeeById(Integer id);

    List<Employee> getAllEmployees();

    Employee updateEmployee(Integer id, Employee employee);

    void deleteEmployee(Integer id);
}
