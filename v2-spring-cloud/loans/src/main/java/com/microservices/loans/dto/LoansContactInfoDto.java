package com.microservices.loans.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "loans")
@Setter
@Getter
public class LoansContactInfoDto {
    String message;
    Map<String, String> contactDetails;
    String onCallSupport;
}