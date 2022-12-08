package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PersonneTest {
    @Test
    void test_personne(){
        Personne personne = new Personne("Diallo","Abdoulaye",19);
        assertEquals("Camara",personne.getNom());
    }
}
