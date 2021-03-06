package com.thoughtworks.springbootemployee.service.impl;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.CompanyService;
import com.thoughtworks.springbootemployee.util.PagingUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final List<Company> companies = new ArrayList<>();

    @Override
    public List<Company> getCompanies() {
        return companies;
    }

    @Override
    public List<Company> getCompanies(Integer page, Integer pageSize) {
        return PagingUtils.paging(companies, page, pageSize);
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
        if (Objects.nonNull(company)) {
            return company.getEmployees();
        }
        return null;
    }

    @Override
    public void deleteCompanyEmployeesById(int id) {
        Company company = getCompany(id);
        if (Objects.nonNull(company)) {
            company.getEmployees().clear();
        }
    }

    @Override
    public void modifyCompany(Company company) {
        deleteCompanyEmployeesById(company.getId());
        addCompany(company);
    }

}
