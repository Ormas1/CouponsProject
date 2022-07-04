package com.or.couponsPhaseTwo.controllers;

import com.or.couponsPhaseTwo.dtos.Purchase;
import com.or.couponsPhaseTwo.logic.PurchasesLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchases")
public class PurchasesController {

    @Autowired
    private PurchasesLogic purchasesLogic;

    @PostMapping
    public long createPurchase(@RequestBody Purchase purchase) {
        long id = purchasesLogic.createPurchase(purchase);
        return id;
    }

    @PutMapping
    public void updatePurchase(@RequestBody Purchase purchase) {
        purchasesLogic.updatePurchase(purchase);
    }

    @DeleteMapping("/{id}")
    public void deletePurchase(@PathVariable("id") long id) {
        purchasesLogic.deletePurchase(id);
    }

    @GetMapping
    public List<Purchase> getAllPurchases() {
        return purchasesLogic.getAllPurchases();
    }
}
