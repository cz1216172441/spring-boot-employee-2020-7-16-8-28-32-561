package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();

    Employee getEmployee(int id);

    List<Employee> getEmployeesByGender(String gender);

    void addEmployee(Employee employee);

    void deleteEmployeeById(int id);

    void modifyEmployee(Employee employee);

    List<Employee> getEmployees(Integer page, Integer pageSize);
}
