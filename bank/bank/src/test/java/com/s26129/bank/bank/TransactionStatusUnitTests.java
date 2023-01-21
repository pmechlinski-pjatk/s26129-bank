package com.s26129.bank.bank;

import com.s26129.bank.bank.model.TransactionStatus;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TransactionStatusUnitTests {

    @Test
    void canGetBalanceChange() {
        TransactionStatus transactionStatus = new TransactionStatus(1000, 500);

        assertThat(transactionStatus.getBalanceChange()).isEqualTo(500);
    }

    @Test
    void canGetFinalChange() {
        TransactionStatus transactionStatus = new TransactionStatus(1000, 500);

        assertThat(transactionStatus.getFinalBalance()).isEqualTo(500);
    }

    @Test
    void canCreateTransactionStatusWithCustomMessage() {
        String message = "This Is Test Message";
        TransactionStatus transactionStatus = new TransactionStatus(message);

        assertThat(transactionStatus.getDescription()).isEqualTo(message);
    }

    @Test
    void canCreateNullCustomMessage() {

        TransactionStatus transactionStatus = new TransactionStatus(null);

        assertThat(transactionStatus.getDescription()).isNull();
    }

    @Test
    void noBalanceChangeWhenCustomMessageStatus() {

        TransactionStatus transactionStatus = new TransactionStatus(null);

        assertThat(transactionStatus.getFinalBalance()).isEqualTo(0);
    }

    @Test
    void declinedWhenCustomMessage() {

        TransactionStatus transactionStatus = new TransactionStatus(null);

        assertThat(transactionStatus.getStatus()).isEqualTo(TransactionStatus.Status.DECLINED);
    }


}
