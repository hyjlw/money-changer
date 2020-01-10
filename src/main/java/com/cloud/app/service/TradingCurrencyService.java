package com.cloud.app.service;

import java.math.BigDecimal;

import com.cloud.app.domain.Currency;
import com.cloud.app.domain.ExchangeCurrency;
import com.cloud.app.domain.Status;
import com.cloud.app.dto.ExchangeDto;
import com.cloud.app.dto.ExchangeResult;
import com.cloud.app.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class TradingCurrencyService implements TradingCurrency {
    @Autowired
    private CurrencyRepository currencyRepository;

    @Override
    public BigDecimal getExchangeRate(Currency targetCurrency) {
        return ((ExchangeCurrency)targetCurrency).getExchangeRate(targetCurrency);
    }

    @Override
    public BigDecimal getExchangedAmount(Currency targetCurrency) {
        return ((ExchangeCurrency)targetCurrency).getExchangedAmount(targetCurrency);
    }

    @Override
    public ExchangeResult getExchangeResult(ExchangeDto req) {
        Currency currency = currencyRepository.findByName(req.getTo());

        ExchangeResult result = new ExchangeResult();

        result.setAmount(req.getAmount() * currency.getRate());

        Status status = new Status(true);

        result.setStatus(status);

        return result;
    }
}