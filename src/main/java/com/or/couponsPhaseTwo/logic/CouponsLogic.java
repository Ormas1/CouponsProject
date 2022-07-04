package com.or.couponsPhaseTwo.logic;

import com.or.couponsPhaseTwo.dtos.Coupon;
import com.or.couponsPhaseTwo.entities.CouponEntity;
import com.or.couponsPhaseTwo.repositories.ICouponsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;

@Service
public class CouponsLogic {

    @Autowired
    private ICouponsRepository couponsRepository;

    public long createCoupon(Coupon coupon) {
        CouponEntity couponEntity = new CouponEntity(coupon);
        couponsRepository.save(couponEntity);
        return couponEntity.getId();
    }

    public void updateCoupon(Coupon coupon) {
        CouponEntity couponEntity = new CouponEntity(coupon);
        couponsRepository.save(couponEntity);
    }

    public void deleteCoupon(long id) {
        couponsRepository.deleteById(id);
    }

    public Coupon getCouponById(long id) {
        CouponEntity couponEntity = couponsRepository.findById(id).get();
        Coupon coupon = new Coupon(couponEntity);
        return coupon;
    }

    public Coupon getCouponByTitle(String title){
       CouponEntity couponEntity = couponsRepository.findByName(title);
       Coupon coupon = new Coupon(couponEntity);
       return coupon;
    }

    public List<Coupon> getAllCoupons() {
        List<Coupon> couponsList = new ArrayList<>();
        Iterable<CouponEntity> couponIterable = couponsRepository.findAll();
        for (CouponEntity couponEntity : couponIterable) {
            Coupon coupon = new Coupon(couponEntity);
            couponsList.add(coupon);
        }
        return couponsList;
    }
}
