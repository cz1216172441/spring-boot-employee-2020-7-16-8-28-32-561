package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final List<Employee> employees=new ArrayList<>();

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployee(int id) {
        return employees.stream()
                .filter(employee -> id == employee.getId())
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Employee> getEmployeesByGender(String gender) {
        return employees.stream()
                .filter(employee -> gender.equals(employee.getGender()))
                .collect(Collectors.toList());
    }
}
