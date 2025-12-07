package com.eazybytes.accounts.dto;

import lombok.*;

@NoArgsConstructor
@Getter @Setter
public class CustomerDetailsDto {
    private CustomerDto customerDto;
    private CardsDto cardsDto;
    private LoansDto loansDto;
}
