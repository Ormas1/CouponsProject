package com.or.couponsPhaseTwo.logic;

import com.or.couponsPhaseTwo.dtos.Coupon;
import com.or.couponsPhaseTwo.dtos.Purchase;
import com.or.couponsPhaseTwo.entities.CouponEntity;
import com.or.couponsPhaseTwo.entities.PurchasesEntity;
import com.or.couponsPhaseTwo.repositories.ICompaniesRepository;
import com.or.couponsPhaseTwo.repositories.IPurchasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchasesLogic {

    @Autowired
    private IPurchasesRepository purchasesRepository;

    public long createPurchase(Purchase purchase) {
        PurchasesEntity purchasesEntity = new PurchasesEntity(purchase);
        purchasesRepository.save(purchasesEntity);
        return purchasesEntity.getId();
    }

    public void updatePurchase(Purchase purchase) {
        PurchasesEntity purchasesEntity = new PurchasesEntity(purchase);
        purchasesRepository.save(purchasesEntity);
    }
    public void deletePurchase(long id) {
        purchasesRepository.deleteById(id);
    }

    public Purchase getPurchaseById(long id) {
        PurchasesEntity purchasesEntity = purchasesRepository.findById(id).get();
        Purchase purchase = new Purchase(purchasesEntity);
        return purchase;
    }

    public List<Purchase> getAllPurchases() {
        List<Purchase> purchasesList = new ArrayList<>();
        Iterable<PurchasesEntity> purchasesIterable = purchasesRepository.findAll();
        for (PurchasesEntity purchasesEntity : purchasesIterable) {
            Purchase purchase = new Purchase(purchasesEntity);
            purchasesList.add(purchase);
        }
        return purchasesList;
    }
}
