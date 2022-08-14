package com.microservices.accounts.creditcard.service;

import com.microservices.accounts.creditcard.model.CreditCard;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CreditCardService {
    Flux<CreditCard> findAll();
    Mono<CreditCard> create(CreditCard creditCard);
    Flux<CreditCard> findByCreditCardNumber(Integer num);
    Mono<CreditCard> update(CreditCard creditCard);
    Mono<CreditCard> deleteById(String creditCardId);
}
