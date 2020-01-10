package com.cloud.app.service;

import com.cloud.app.domain.Currency;
import com.cloud.app.repository.CurrencyJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyJpaRepository currencyJpaRepository;

    public List<Currency> getCurrencies(){
        return currencyJpaRepository.findAll();
    }

    public void add(Currency currency) {
        currencyJpaRepository.save(currency);
    }
}
