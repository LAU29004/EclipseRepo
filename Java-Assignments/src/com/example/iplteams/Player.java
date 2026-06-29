package com.example.iplteams;

public class Player {

    private int id;
    private String name;
    private String role;
    private double bidAmount;

    public Player(int id, String name, String role, double bidAmount) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.bidAmount = bidAmount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Role: " + role + ", Bid: " + bidAmount + " Cr";
    }
}