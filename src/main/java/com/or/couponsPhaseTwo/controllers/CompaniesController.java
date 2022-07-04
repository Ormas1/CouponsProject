package com.or.couponsPhaseTwo.controllers;

import com.or.couponsPhaseTwo.dtos.Company;
import com.or.couponsPhaseTwo.logic.CompaniesLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompaniesController {

    @Autowired
    private CompaniesLogic companiesLogic;

    @PostMapping
    public long createCompany(@RequestBody Company company) {
        long id = companiesLogic.createCompany(company);
        return id;
    }

    @PutMapping
    public void updateCompany(@RequestBody Company company) {
        companiesLogic.updateCompany(company);
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable("id") long id) {
        companiesLogic.deleteCompany(id);
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable("id") long id) {
        return companiesLogic.getCompanyById(id);
    }

    @GetMapping
    public List<Company> getAllCompanies() {
        return companiesLogic.getAllCompanies();
    }

    @GetMapping("/byName")
    public Company getCompanyByName(@RequestParam(name = "name") String name) {
        return companiesLogic.getCompanyByName(name);
    }
}


