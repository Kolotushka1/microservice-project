package com.microservices.cards.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@ConfigurationProperties(prefix = "cards")
@Setter
@Getter
public class CardsContactInfoDto {
    String message;
    Map<String, String> contactDetails;
    String onCallSupport;
}
