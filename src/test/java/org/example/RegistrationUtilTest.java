package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegistrationUtilTest {
    RegistrationUtil enregistre;
    @BeforeEach
    void setUp() {
        enregistre = new RegistrationUtil();

    }
    @Test
    void test_registration(){

        assertFalse(enregistre.ValidateUserInput("d","aaaa",""));
        assertTrue(enregistre.ValidateUserInput("","aaaa","aaaa"));
    }

}