package com.s26129.bank.bank;

import com.s26129.bank.bank.model.Client;
import com.s26129.bank.bank.model.Transaction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TransactionUnitTests {

    Transaction transaction = new Transaction(1, 1000, new Client(1 ,5000));

    @Test
    void transactionCanBeCreated() {
        assertThat(transaction).isNotNull();
    }

    @Test
    void canGetId(){
        Transaction transaction1 = new Transaction(123, 5555, new Client(111, 11111));
        assertThat(transaction1.getTransactionId()).isEqualTo(123);
    }

    @Test
    void canGetValue() {
        double value = 6789.50;
        Transaction transaction1 = new Transaction(123, value, new Client(111, 11111));
        assertThat(transaction1.getValue()).isEqualTo(value);
    }

    @Test
    void canGetSender() {
        assertThat(transaction.getSender()).isNotNull();
    }

}
