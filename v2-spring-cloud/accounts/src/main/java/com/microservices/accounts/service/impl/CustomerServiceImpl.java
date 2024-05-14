package com.microservices.accounts.service.impl;

import com.microservices.accounts.dto.CustomerDetailsDto;
import com.microservices.accounts.repository.AccountsRepository;
import com.microservices.accounts.repository.CustomerRepository;
import com.microservices.accounts.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    /**
     * @param mobileNumber
     * @return Customer Details based on a given mobileNumber
     */
    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
        return null;
    }

}
