package com.cloud.app.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Status {
    private boolean success;
    private String message;

    public Status(){}

    public Status(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
