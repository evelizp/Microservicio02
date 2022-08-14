package com.microservices.accounts.creditcard.controller;

import com.microservices.accounts.creditcard.model.CreditCard;
import com.microservices.accounts.creditcard.service.CreditCardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/creditcards")
public class CreditCardController {

    @Autowired
    private CreditCardService service;

    @GetMapping
    public Flux<CreditCard> getAll(){
        return service.findAll();
    }

    @PostMapping
    public Mono<CreditCard> create(@RequestBody CreditCard creditCard){
        return service.create(creditCard);
    }

    @GetMapping("/find/{num}")
    public Flux<CreditCard> getByIdCreditCard(@PathVariable("num") Integer num){
        return service.findByCreditCardNumber(num);
    }


    @PostMapping("/update")
    public Mono<CreditCard> update(@RequestBody CreditCard creditCard){
        return service.update(creditCard);
    }

    @DeleteMapping("byId/{id}")
    public Mono<CreditCard> deleteById(@RequestBody String creditCardId){
        return service.deleteById(creditCardId);
    }



}
