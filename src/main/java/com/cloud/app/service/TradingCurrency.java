package com.cloud.app.service;

import com.cloud.app.domain.Currency;
import com.cloud.app.dto.ExchangeDto;
import com.cloud.app.dto.ExchangeResult;

import java.math.BigDecimal;


public interface TradingCurrency {
    BigDecimal getExchangeRate(Currency targetCurrency);

    BigDecimal getExchangedAmount(Currency targetCurrency);

    ExchangeResult getExchangeResult(ExchangeDto req);
}