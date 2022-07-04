package com.or.couponsPhaseTwo.repositories;


import com.or.couponsPhaseTwo.entities.CustomersEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICustomersRepository extends CrudRepository<CustomersEntity, Long> {

}

