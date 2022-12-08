package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    @Test
    void test_if_calculated_add_is_working(){
        SimpleCalculator calculator = new SimpleCalculator();
       assertEquals(20, calculator.calculeAdd(10,10));
    }
    @Test
    void test_if_calculated_sous_is_working(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(5,calculator.soustration(10,5));
    }
    @Test
    void test_multiplication(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(20,calculator.multiplication(10,2));
    }

    @Test
    void test_division(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertEquals(20,calculator.division(40,2));
    }
    @Test
    void test_is_paire(){
        SimpleCalculator calculator = new SimpleCalculator();
        assertTrue(calculator.nombreEstPaire(10));
        assertFalse(calculator.nombreEstPaire(6));
    }

}