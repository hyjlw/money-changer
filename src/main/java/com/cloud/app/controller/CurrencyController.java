package com.cloud.app.controller;

import java.util.List;

import com.cloud.app.domain.Currency;
import com.cloud.app.domain.Status;
import com.cloud.app.dto.ExchangeDto;
import com.cloud.app.dto.ExchangeResult;
import com.cloud.app.service.CurrencyService;
import com.cloud.app.service.TradingCurrency;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
@Api(tags = {"Currency rest apis"}, value = "Currency module")
public class CurrencyController
{
    @Autowired
    private TradingCurrency tradingCurrency;

    @Autowired
    private CurrencyService currencyService;

    @RequestMapping(value = "/list")
    public List<Currency> getCurrencies()
    {
        return currencyService.getCurrencies();
    }

    @RequestMapping(value = "/add")
    public Status add(Currency currency)
    {
        currencyService.add(currency);
        return new Status(true);
    }

    @RequestMapping(value = "/exchange")
    public ExchangeResult exchange(@RequestBody ExchangeDto req) {
        return tradingCurrency.getExchangeResult(req);
    }

}