package com.or.couponsPhaseTwo.repositories;

import com.or.couponsPhaseTwo.entities.PurchasesEntity;
import org.springframework.data.repository.CrudRepository;

public interface IPurchasesRepository extends CrudRepository<PurchasesEntity, Long> {
}
