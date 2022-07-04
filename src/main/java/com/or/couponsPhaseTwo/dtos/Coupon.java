package com.or.couponsPhaseTwo.dtos;

import com.or.couponsPhaseTwo.entities.CouponEntity;
import com.or.couponsPhaseTwo.enums.Category;

import java.util.Date;

public class Coupon {

    private long id;
    private long companyId;
    private Category category;
    private String title;
    private String description;
    private Date startDate;
    private Date endDate;
    private int amount;
    private float price;
    private String image;

    public Coupon(CouponEntity couponEntity) {
        this.id = couponEntity.getId();
        this.companyId = couponEntity.getCompanyId();
        this.category = couponEntity.getCategory();
        this.title = couponEntity.getTitle();
        this.description = couponEntity.getDescription();
        this.startDate = couponEntity.getStartDate();
        this.endDate = couponEntity.getEndDate();
        this.amount = couponEntity.getAmount();
        this.price = couponEntity.getPrice();
        this.image = couponEntity.getImage();
    }


    public Coupon() {
    }

    public Coupon(long id, long companyId, Category category, String title, String description, Date startDate, Date endDate, int amount, float price, String image) {
        this.id = id;
        this.companyId = companyId;
        this.category = category;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.price = price;
        this.image = image;
    }

    public Coupon(long companyId, Category category, String title, String description, Date startDate, Date endDate, int amount, float price, String image) {
        this.companyId = companyId;
        this.category = category;
        this.title = title;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.amount = amount;
        this.price = price;
        this.image = image;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
