package com.or.couponsPhaseTwo.controllers;

import com.or.couponsPhaseTwo.dtos.Coupon;
import com.or.couponsPhaseTwo.logic.CouponsLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupons")
public class CouponsController {

    @Autowired
    private CouponsLogic couponsLogic;

    @PostMapping
    public long createCompany(@RequestBody Coupon coupon) {
        long id = couponsLogic.createCoupon(coupon);
        return id;
    }

    @PutMapping
    public void updateCoupon(@RequestBody Coupon coupon) {
        couponsLogic.updateCoupon(coupon);
    }

    @DeleteMapping("/{id}")
    public void deleteCoupon(@PathVariable("id") long id) {
        couponsLogic.deleteCoupon(id);
    }

    @GetMapping("/{id}")
    public Coupon getCouponById(@PathVariable("id") long id) {
        return couponsLogic.getCouponById(id);
    }

    @GetMapping
    public List<Coupon> getAllCoupons() {
        return couponsLogic.getAllCoupons();
    }

    @GetMapping("/byName")
    public Coupon getCouponByTitle(@PathVariable("title") String title){
        return couponsLogic.getCouponByTitle(title);
    }
}
