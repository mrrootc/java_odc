package org.example;

import java.util.function.Supplier;

public class SimpleCalculator {
    public int calculeAdd(int num1, int num2){
        return num1 + num2;
    }
    public int soustration(int num1,int num2){
        return num1 - num2;
    }
    public int multiplication(int num1,int num2){
        return num1 * num2;
    }

    public  int division(int num1, int num2){
        if( num2 == 0) {
            System.out.println("La division est impossible");
        }else {
            return num1/num2;
        }
        return num1;
    }
    public boolean nombreEstPaire(int num ) {
        if (num % 2 == 0) {
            return true;
        }else {
            return false;
        }
    }
}