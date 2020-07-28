package com.thoughtworks.springbootemployee.entity;

public class Employee {
    private int id;
    private String gender;

    public int getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setId(int id) {
        this.id = id;
    }
}
