package com.or.couponsPhaseTwo.logic;

import com.or.couponsPhaseTwo.dtos.Company;
import com.or.couponsPhaseTwo.entities.CompanyEntity;
import com.or.couponsPhaseTwo.repositories.ICompaniesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompaniesLogic {

    @Autowired
    private ICompaniesRepository companiesRepository;

    public long createCompany(Company company) {
        CompanyEntity companyEntity = new CompanyEntity(company);
        companiesRepository.save(companyEntity);
        return companyEntity.getId();
    }

    public void updateCompany(Company company) {
        CompanyEntity companyEntity = new CompanyEntity(company);
        companiesRepository.save(companyEntity);
    }

    public void deleteCompany(long id) {
        companiesRepository.deleteById(id);
    }

    public Company getCompanyById(long id) {
        CompanyEntity companyEntity = companiesRepository.findById(id).get();
        Company company = new Company(companyEntity);
        return company;
    }

    public List<Company> getAllCompanies() {
        List<Company> companiesList = new ArrayList<>();
        Iterable<CompanyEntity> companiesIterable = companiesRepository.findAll();
        for (CompanyEntity companyEntity : companiesIterable) {
            Company company = new Company(companyEntity);
            companiesList.add(company);
        }
        return companiesList;
    }

    public Company getCompanyByName(String name) {
        CompanyEntity companyEntity = companiesRepository.findByName(name);
        Company company = new Company(companyEntity);
        return company;
    }
}