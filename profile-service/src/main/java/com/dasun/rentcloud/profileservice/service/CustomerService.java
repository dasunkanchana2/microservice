package com.dasun.rentcloud.profileservice.service;

import com.dasun.rentcloud.commons.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save(Customer customer);

    Customer fetchById(int customerId);

    List<Customer> fetchAllProfiles();
}
