package com.mmcoe.Stock;

public class StockImpl implements Stock {
    private String name;
    private double price;

    public StockImpl(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + " @ " + price;
    }

    public static void main(String[] args) {
        StockImpl s1 = new StockImpl("Infosys", 1500.00);
        StockImpl s2 = new StockImpl("TCS", 3200.00);
        System.out.println("Created Stocks:");
        System.out.println(s1);
        System.out.println(s2);
    }
}
