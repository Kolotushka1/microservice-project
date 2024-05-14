package com.microservices.accounts.service;

import com.microservices.accounts.dto.CustomerDetailsDto;

public interface ICustomerService {
    /**
     *
     * @param mobileNumber
     * @return Customer Details based on a given mobileNumber
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
