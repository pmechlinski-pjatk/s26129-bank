package com.s26129.bank.bank.model;

import java.util.Optional;

public class TransactionStatus {
    public enum Status {
        ACCEPTED, DECLINED
    }

    private Status status;

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
    private final double balanceChange;

    public double getBalanceChange() {
        return balanceChange;
    }


    public double getFinalBalance() {
        return balanceChange;
    }

    public TransactionStatus(double entryBalance, double transactionValue) {
        this.status = Status.ACCEPTED;
        this.balanceChange = entryBalance - transactionValue;
    }

    public TransactionStatus(String customStatus) {
        this.description = customStatus;
        this.status = Status.DECLINED;
        this.balanceChange = 0;
    }
}
