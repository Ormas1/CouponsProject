package com.or.couponsPhaseTwo.repositories;

import com.or.couponsPhaseTwo.entities.CouponEntity;
import org.springframework.data.repository.CrudRepository;


public interface ICouponsRepository extends CrudRepository<CouponEntity, Long> {
    public CouponEntity findByName(String title);
}
