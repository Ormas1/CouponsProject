package com.or.couponsPhaseTwo.repositories;

import com.or.couponsPhaseTwo.entities.CompanyEntity;
import org.springframework.data.repository.CrudRepository;


public interface ICompaniesRepository extends CrudRepository<CompanyEntity, Long> {
    public CompanyEntity findByName(String name);
}

