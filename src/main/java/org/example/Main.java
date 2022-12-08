package org.example;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello world!");
        SimpleCalculator calculator = new SimpleCalculator();
        int result = calculator.calculeAdd(70,10);
        System.out.println(result);
        int sous = calculator.division(10,0);
        System.out.println(sous);*/

        Personne personne = new Personne("Camara","Abdoulaye",19);
        String nom = personne.getNom();
        System.out.println(nom);
    }

}