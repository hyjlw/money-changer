package com.cloud.app.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

@ApiModel("Currency Entity")
public class ExchangeCurrency extends Currency
{
    private static final long serialVersionUID = 1L;


    public BigDecimal getExchangeRate(Currency targetCurrency) {
        return BigDecimal.valueOf(targetCurrency.getRate());
    }

    public BigDecimal getExchangedAmount(Currency targetCurrency){
        return BigDecimal.valueOf(targetCurrency.getRate());
    }

}