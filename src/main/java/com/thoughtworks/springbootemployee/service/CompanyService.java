package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;

import java.util.List;

public interface CompanyService {
    List<Company> getCompanies();

    void addCompany(Company company);

    Company getCompany(int id);

    List<Employee> getCompanyEmployees(int id);

    void deleteCompanyById(int id);

    void modifyCompany(Company company);
}
