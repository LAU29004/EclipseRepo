package com.mmcoe.Stock;

public class StockSingleton {
    private static StockSingleton instance;
    private Stock stock;

    private StockSingleton() {
        stock = new StockImpl("DefaultStock", 100.0);
    }

    public static StockSingleton getInstance() {
        if (instance == null) {
            instance = new StockSingleton();
        }
        return instance;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
