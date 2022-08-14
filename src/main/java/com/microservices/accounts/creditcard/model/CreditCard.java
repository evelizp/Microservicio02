package com.microservices.accounts.creditcard.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection ="creditCards")
public class CreditCard {

    @Id
    private String creditCardId;

    private String customerId;

    private String creditCardNumber;

    private String expeditionDate;

    private String expirationDate;

    private Double creditLimit;

}
