package com.eazybytes.loans.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "loans")
@Getter @Setter
public class LoansContactInfoDto {
    String details;
    Map<String,String> contactInfo;
    Map<String,String> phoneNo;
}
