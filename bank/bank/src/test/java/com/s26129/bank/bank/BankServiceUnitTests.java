package com.s26129.bank.bank;


import com.s26129.bank.bank.model.Client;
import com.s26129.bank.bank.model.Transaction;
import com.s26129.bank.bank.model.TransactionStatus;
import com.s26129.bank.bank.storage.ClientStorage;
import com.s26129.bank.bank.storage.TransactionStorage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class bankServiceUnitTests {

    @Mock
    private ClientStorage clientStorage;

    @Mock
    private TransactionStorage transactionStorage;

    @InjectMocks
    private BankService bankService;

    @Test
    void newClientCanBeRegistered(){

        when(clientStorage.getClientList()).thenReturn(new ArrayList<Client>());
        int returnCode = bankService.registryNewClient(555);
        assertThat(returnCode).isEqualTo(0);
    }
//
//    public int registryNewClient(double entryBalance) {
//        if (entryBalance >= 0) {
//            clientStorage.getClientList().add(new Client(clientStorage.getLastClientId() + 1, entryBalance));
//            return 0;
//        } else {
//            return 1;
//        }
//    }
//
//    public TransactionStatus createNewTransaction(int senderId, double transactionValue) {
//        Client client = clientStorage.findClientById(senderId);
//        if (client == null) {
//            return new TransactionStatus("Sender doesn't exist!");
//        }
//
//        double clientBalance = clientStorage.findClientById(senderId).getBalance();
//        if (clientBalance < 0) {
//            return new TransactionStatus("Transaction value exceeds sender's balance!");
//        }
//
//        TransactionStatus transactionStatus = new TransactionStatus(clientBalance, transactionValue);
//        client.setBalance(transactionStatus.getFinalBalance());
//
//        transactionStorage.getTransactionList().add(new Transaction( transactionStorage.getTransactionList().size()+1, transactionValue, client));
//        return new TransactionStatus(clientBalance, transactionValue);
//    }
//
//    public TransactionStatus addToBalance(int senderId, double transactionValue) {
//        if (transactionValue <= 0) {
//            return new TransactionStatus("Tried to order transaction with a negative value!");
//        }
//        try {
//            clientStorage.findClientById(senderId);
//        } catch (NullPointerException e) {
//            return new TransactionStatus("Sender doesn't exist!");
//        }
//        Client client = clientStorage.findClientById(senderId);
//        double clientBalance = clientStorage.findClientById(senderId).getBalance();
//        TransactionStatus transactionStatus = new TransactionStatus(clientBalance, transactionValue);
//        client.setBalance(transactionStatus.getFinalBalance());
//        return transactionStatus;
//    }
//
//    public Map<String, String> getClientData(int clientId) {
//        Map<String, String> outputData = new HashMap<>();
//        try {
//            clientStorage.findClientById(clientId);
//        } catch (NullPointerException e) {
//            return outputData;
//        }
//        Client client = clientStorage.findClientById(clientId);
//        outputData.put("ID", String.valueOf(client.getClientId()));
//        outputData.put("Balance", String.valueOf(client.getBalance()));
//
//        int personalTransactionNumber = 1;
//        for (Transaction transaction : transactionStorage.getTransactionList()) {
//            if (transaction.getTransactionId() == clientId) {
//                outputData.put("Transaction no." + personalTransactionNumber, transaction.toString());
//                personalTransactionNumber++;
//            }
//
//        }
//        return outputData;
//    }
}
