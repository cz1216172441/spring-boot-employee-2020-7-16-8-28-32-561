package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.entity.Company;
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
}
