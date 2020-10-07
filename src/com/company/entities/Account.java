package com.company.entities;

import com.company.exceptions.TradeIDException;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private final List<Trade> trades = new ArrayList<>();

    public Account() {
    }

    public double getTotal() {
        double total = 0.0;
        for (Trade trade : trades) {
            total += trade.getPrice() * trade.getQuantity();
        }

        return total;
    }

    public void setTrade(Trade trade) throws TradeIDException {
        boolean idAlreadyExist = false;
        for (Trade t: trades) {
            if (t.getId().equals(trade.getId())) {
                idAlreadyExist = true;
                break;
            }
        }

        if(idAlreadyExist) {
            throw new TradeIDException("Duplicate ID cannot be used");
        }

        trades.add(trade);
    }
}
