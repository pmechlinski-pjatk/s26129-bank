package com.s26129.bank.bank;

import com.s26129.bank.bank.model.Client;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.anyOf;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ClientUnitTests {

    private Client client;

    @Test
    void clientIdSuccessfullyReturned() {
        Client client = new Client(1, 100000);

        assertThat(client.getClientId()).isEqualTo(1);
    }

    @Test
    void clientBalanceSuccessfullyReturned() {
        double balance = 20.20;
        Client client = new Client(1, balance);

        assertThat(client.getBalance()).isEqualTo(balance);
    }

    @Test
    void newClientCanBeCreated() {
        assertThat(new Client(1, 1)).isNotNull();
    }

    @Test
    void balanceCanBeSetAnew() {
        Client client = new Client(1, 100000);
        client.setBalance(0);
        assertThat(client.getBalance()).isEqualTo(0);
    }

}
