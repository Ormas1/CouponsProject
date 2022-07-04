package com.or.couponsPhaseTwo.dtos;

import com.or.couponsPhaseTwo.entities.CustomersEntity;


public class Customer {
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Customer() {
    }

    public Customer(CustomersEntity customersEntity) {
        this.id = customersEntity.getId();
        this.firstName = customersEntity.getFirstName();
        this.lastName = customersEntity.getLastName();
        this.phoneNumber = customersEntity.getPhoneNumber();
        this.address = customersEntity.getAddress();
    }

    public Customer(String firstName, String lastName, String phoneNumber, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public Customer(long id, String firstName, String lastName, String phoneNumber, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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
}
