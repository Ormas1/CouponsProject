package com.or.couponsPhaseTwo.entities;

import com.or.couponsPhaseTwo.dtos.Purchase;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "purchases")
public class PurchasesEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "couponId", unique = true, nullable = false)
    private long couponId;

    @Column(name = "userId", nullable = false)
    private String userId;

    @Column(name = "amount")
    private int amount;

    @Column(name = "timeStamp")
    private Date timeStamp;

//    @OneToMany
//    private UserEntity user;


    public PurchasesEntity() {
    }

    public PurchasesEntity(Purchase purchase) {
        this.id = purchase.getPurchaseId();
        this.couponId = purchase.getCouponId();
        this.userId = purchase.getUserId();
        this.amount = purchase.getAmount();
        this.timeStamp = purchase.getTimeStamp();
    }

    public PurchasesEntity(long id, int couponId, String userId, int amount, Date timeStamp) {
        this.id = id;
        this.couponId = couponId;
        this.userId = userId;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    public PurchasesEntity(int couponId, String userId, int amount, Date timeStamp) {
        this.couponId = couponId;
        this.userId = userId;
        this.amount = amount;
        this.timeStamp = timeStamp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
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

