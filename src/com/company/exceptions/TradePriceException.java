package com.company.exceptions;

public class TradePriceException extends Exception {

    public TradePriceException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
