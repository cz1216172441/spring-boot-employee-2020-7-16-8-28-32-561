package com.thoughtworks.springbootemployee.entity;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private int id;
    private String name;
    private final List<Employee> employees = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
