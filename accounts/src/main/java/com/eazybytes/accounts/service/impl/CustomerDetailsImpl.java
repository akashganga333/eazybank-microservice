package com.eazybytes.accounts.service.impl;

import com.eazybytes.accounts.dto.CardsDto;
import com.eazybytes.accounts.dto.CustomerDetailsDto;
import com.eazybytes.accounts.dto.CustomerDto;
import com.eazybytes.accounts.dto.LoansDto;
import com.eazybytes.accounts.service.IAccountsService;
import com.eazybytes.accounts.service.ICustomerDetailsService;
import com.eazybytes.accounts.service.client.CardsFeignClient;
import com.eazybytes.accounts.service.client.LoansFeignClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerDetailsImpl implements ICustomerDetailsService {

    IAccountsService accountsService;
    LoansFeignClient loansFeignClient;
    CardsFeignClient cardsFeignClient;

    @Override
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber) {
        CustomerDto customerDto = accountsService.fetchAccount(mobileNumber);
        LoansDto loansDto = loansFeignClient.fetchLoanDetails(mobileNumber).getBody();
        CardsDto cardsDto = cardsFeignClient.fetchCardDetails(mobileNumber).getBody();
        CustomerDetailsDto customerDetailsDto = new CustomerDetailsDto();
        customerDetailsDto.setCustomerDto(customerDto);
        customerDetailsDto.setCardsDto(cardsDto);
        customerDetailsDto.setLoansDto(loansDto);
        return customerDetailsDto;
    }
}
