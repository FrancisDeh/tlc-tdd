package com.company;

import com.company.entities.Trade;
import com.company.entities.Trader;
import com.company.exceptions.TradeIDException;
import com.company.exceptions.TradePriceException;

public class Main {

    public static void main(String[] args) throws TradePriceException, TradeIDException {

        Trade trade = new Trade("T1", "APPL", 100, 15.25);
        Trade trade2 = new Trade("T2", "MML", 10, 10.25);
        Trade trade3 = new Trade("T3", "HHL", 5);


        Trader trader = new Trader("Juliet");
        trader.addTrade(trade);
        trader.addTrade(trade2);
        trader.addTrade(trade3);

        System.out.println(trader.getTradeTotal());
    }
}
