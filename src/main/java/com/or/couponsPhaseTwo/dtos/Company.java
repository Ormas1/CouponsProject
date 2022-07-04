package com.or.couponsPhaseTwo.dtos;

import com.or.couponsPhaseTwo.entities.CompanyEntity;

public class Company {

    private long id;
    private String name;
    private String phoneNumber;
    private String address;


    public Company(CompanyEntity company) {
        this.id = company.getId();
        this.name = company.getName();
        this.phoneNumber = company.getPhoneNumber();
        this.address = company.getAddress();
    }

    public Company() {
    }

    // For DB extractions (there WILL be an id for each user)
    public Company(long id, String name, String phone_number, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phone_number;
        this.address = address;
    }

    // For insertions (no id)
    public Company(String name, String phone_number, String address) {
        this.name = name;
        this.phoneNumber = phone_number;
        this.address = address;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone_number='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
