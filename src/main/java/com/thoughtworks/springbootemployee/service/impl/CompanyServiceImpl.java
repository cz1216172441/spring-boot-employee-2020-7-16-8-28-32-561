package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CompanyServiceImpl implements CompanyService {
    private final List<Company> companies=new ArrayList<>();
    @Override
    public List<Company> getCompanies() {
        return companies;
    }

    @Override
    public void addCompany(Company company) {
        companies.add(company);
    }

    @Override
    public Company getCompany(int id) {
        return companies.stream()
                .filter(company -> id == company.getId())
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Employee> getCompanyEmployees(int id) {
        Company company = getCompany(id);
        if (company != null) {
            return company.getEmployees();
        }
        return null;
    }
}
