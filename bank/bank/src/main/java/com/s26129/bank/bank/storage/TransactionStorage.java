package com.s26129.bank.bank.storage;

import com.s26129.bank.bank.model.Client;
import com.s26129.bank.bank.model.Transaction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TransactionStorage {
    private final List<Transaction> transactionList = new ArrayList<>();

    public TransactionStorage() {
    }

    public Transaction findTransactionById(int searchedId) {
        for (Transaction transaction : transactionList) {
            if (transaction.getTransactionId() == searchedId) {
                return transaction;
            }
        }
        return null;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }
}

