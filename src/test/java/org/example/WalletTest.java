package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WalletTest {
  Wallet wallet;
    @BeforeEach
    void setUp() {
       wallet = new Wallet(55000.0);
    }
    @Test
     void  wallet_test(){
        double actuel  =   wallet.getSolde();
        assertEquals(actuel,55000.0);


    }
}