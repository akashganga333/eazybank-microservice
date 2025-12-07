package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.dto.CustomerDetailsDto;
import com.eazybytes.accounts.service.ICustomerDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")

public class CustomerController {
    @Autowired
    ICustomerDetailsService customerDetailsService;

    @GetMapping("/fetch")
    public ResponseEntity<CustomerDetailsDto> fetchCustomerDetails(String mobileNumber){

        return ResponseEntity.status(HttpStatus.OK).body(customerDetailsService.fetchCustomerDetails(mobileNumber));
    }
}
