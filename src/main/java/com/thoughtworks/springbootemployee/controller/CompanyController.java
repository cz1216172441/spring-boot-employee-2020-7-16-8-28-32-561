package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Company;
import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @GetMapping("/companies")
    public List<Company> getCompanies(@RequestParam(required = false) Integer page,
                                      @RequestParam(required = false) Integer pageSize) {
        if (Objects.nonNull(page) && Objects.nonNull(pageSize)) {
            return companyService.getCompanies(page, pageSize);
        }
        return companyService.getCompanies();
    }

    @PostMapping("/companies")
    public void addCompany(Company company) {
        companyService.addCompany(company);
    }

    @GetMapping("/companies/{id}")
    public Company getCompany(@PathVariable("id") int id) {
        return companyService.getCompany(id);
    }

    @GetMapping("/companies/{id}/employees")
    public List<Employee> getCompanyEmployees(@PathVariable("id") int id) {
        return companyService.getCompanyEmployees(id);
    }

    @DeleteMapping("/companies/{id}")
    public void deleteCompanyEmployeesById(@PathVariable("id") int id) {
        companyService.deleteCompanyEmployeesById(id);
    }

    @PutMapping("/companies")
    public void modifyCompany(Company company) {
        companyService.modifyCompany(company);
    }

}
