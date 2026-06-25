package com.mmcoe.Stock;

public interface Exchange {
    void listStock(Stock stock);
    void tradeStock(Holder buyer, Stock stock);
}
