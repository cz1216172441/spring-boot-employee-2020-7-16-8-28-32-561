package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Company;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CompanyService {
    List<Company> getCompanies();

    void addCompany(Company company);
}
