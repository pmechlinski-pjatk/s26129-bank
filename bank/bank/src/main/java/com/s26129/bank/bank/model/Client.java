package com.s26129.bank.bank.model;

public class Client {
    private final int clientId;
    private double balance;

    public int getClientId() {
        return clientId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client(int clientId, double balance) {
        this.clientId = clientId;
        this.balance = balance;
    }
}
