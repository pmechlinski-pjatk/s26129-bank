package com.s26129.bank.bank.model;

public class Transaction {
    private final int transactionId;
    private final double value;
    private final Client sender;
    // Receiver not in scope


    public Transaction(int transactionId, double value, Client sender) {
        this.transactionId = transactionId;
        this.value = value;
        this.sender = sender;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public double getValue() {
        return value;
    }

    public Client getSender() {
        return sender;
    }
}
