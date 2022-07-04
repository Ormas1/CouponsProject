package com.or.couponsPhaseTwo.dtos;

import com.or.couponsPhaseTwo.entities.PurchasesEntity;

import java.util.Date;

public class Purchase {
    private long purchaseId;
    private long couponId;
    private String userId;
    private int amount;
    private Date timeStamp;


    public Purchase(PurchasesEntity purchasesEntity) {
        this.purchaseId = purchasesEntity.getId();
        this.couponId = purchasesEntity.getCouponId();
        this.userId = purchasesEntity.getUserId();
        this.amount = purchasesEntity.getAmount();
        this.timeStamp = purchasesEntity.getTimeStamp();
    }

    public Purchase() {
    }

    public Purchase(long purchaseId, long couponId, String userId, int amount, Date timeStamp) {
        this.purchaseId = purchaseId;
        this.couponId = couponId;
        this.userId = userId;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    public Purchase(long couponId, String userId, int amount, Date timeStamp) {
        this.couponId = couponId;
        this.userId = userId;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    public long getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(long purchaseId) {
        this.purchaseId = purchaseId;
    }

    public long getCouponId() {
        return couponId;
    }

    public void setCouponId(long couponId) {
        this.couponId = couponId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
