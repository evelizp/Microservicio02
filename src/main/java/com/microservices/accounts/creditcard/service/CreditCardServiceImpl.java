package com.microservices.accounts.creditcard.service;

import com.microservices.accounts.creditcard.model.CreditCard;
import com.microservices.accounts.creditcard.repository.CreditCardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class CreditCardServiceImpl implements CreditCardService{

    @Autowired
    private CreditCardRepository creditCardRepository;

    @Override
    public Flux<CreditCard> findAll() {
        return creditCardRepository.findAll();
    }

    @Override
    public Mono<CreditCard> create(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);
    }

    @Override
    public Flux<CreditCard> findByCreditCardNumber(Integer num) {
        return creditCardRepository.findByCreditCardNumber(num);
    }

    @Override
    public Mono<CreditCard> update(CreditCard creditCard) {
        return creditCardRepository.save(creditCard);
    }

    @Override
    public Mono deleteById(String creditCardId) {
        return creditCardRepository.deleteById(creditCardId);
    }
}
