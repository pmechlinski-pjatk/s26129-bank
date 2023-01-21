package com.s26129.bank.bank.storage;

import com.s26129.bank.bank.model.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClientStorage {
    private final List<Client> clientList = new ArrayList<>();

    public ClientStorage() {

    }

    public Client findClientById(int searchedId) {
        for (Client client : clientList) {
            if (client.getClientId() == searchedId) {
                return client;
            }
        }
        return null;
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public int getLastClientId() {
        try {
            return (this.clientList.size() - 1);
        } catch (Exception IndexOutOfBoundsException) {
            // List is empty, so the client would be the first one.
            return 0;
        }
    }
}

