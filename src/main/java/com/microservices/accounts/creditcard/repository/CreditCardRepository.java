package com.microservices.accounts.creditcard.repository;

import com.microservices.accounts.creditcard.model.CreditCard;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface CreditCardRepository extends ReactiveMongoRepository<CreditCard, String> {

    Flux<CreditCard> findByCreditCardNumber(Integer num);
}
