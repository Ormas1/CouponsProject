package com.or.couponsPhaseTwo.logic;

import com.or.couponsPhaseTwo.dtos.Customer;
import com.or.couponsPhaseTwo.entities.CustomersEntity;
import com.or.couponsPhaseTwo.repositories.ICustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomersLogic {

    @Autowired
    private ICustomersRepository customersRepository;

    public long createCustomer(Customer customer) {
        CustomersEntity customersEntity = new CustomersEntity(customer);
        customersRepository.save(customersEntity);
        return customersEntity.getId();
    }

    public void updateCustomer(Customer customer) {
        CustomersEntity customersEntity = new CustomersEntity(customer);
        customersRepository.save(customersEntity);
    }

    public void deleteCustomer(long id) {
        customersRepository.deleteById(id);
    }

    public Customer getCustomerById(long id) {
        CustomersEntity customersEntity = customersRepository.findById(id).get();
        Customer customer = new Customer(customersEntity);
        return customer;
    }

    public List<Customer> getAllCustomers() {
        List<Customer> customerList = new ArrayList<>();
        Iterable<CustomersEntity> customersIterable = customersRepository.findAll();
        for (CustomersEntity customersEntity : customersIterable) {
            Customer customer = new Customer(customersEntity);
            customerList.add(customer);
        }
        return customerList;
    }
}
