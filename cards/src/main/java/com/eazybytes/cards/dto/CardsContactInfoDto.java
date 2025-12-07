package com.eazybytes.cards.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "cards")
@Getter @Setter
public class CardsContactInfoDto{
    private String details;
    private Map<String,String> contactInfo;
    private Map<String,String> phoneNo;
}
