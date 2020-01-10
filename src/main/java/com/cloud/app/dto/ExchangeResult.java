package com.cloud.app.dto;

import com.cloud.app.domain.Status;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class ExchangeResult {
    private double amount;
    private Status status;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
