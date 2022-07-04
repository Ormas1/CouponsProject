package com.or.couponsPhaseTwo.controllers;

import com.or.couponsPhaseTwo.dtos.Customer;
import com.or.couponsPhaseTwo.logic.CustomersLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupons")
public class CustomersController {

    @Autowired
    private CustomersLogic customersLogic;

    @PostMapping
    public long createCustomer(@RequestBody Customer customer) {
        long id = customersLogic.createCustomer(customer);
        return id;
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer) {
        customersLogic.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") long id) {
        customersLogic.deleteCustomer(id);
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") long id) {
        return customersLogic.getCustomerById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customersLogic.getAllCustomers();
    }

}
