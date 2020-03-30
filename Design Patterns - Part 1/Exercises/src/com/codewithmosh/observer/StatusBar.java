package com.codewithmosh.observer;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer{
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks)
            System.out.println("StatusBar: " + stock.toString());
    }

    @Override
    public void update(Stock stock) {
        for (Stock stock1:stocks){
            if (stock1.getSymbol() == stock.getSymbol()) {
                stocks.remove(stock1);
                stocks.add(stock);
                System.out.println("Updating Status Bar ...");
                show();
                break;
            }
        }
    }
}
