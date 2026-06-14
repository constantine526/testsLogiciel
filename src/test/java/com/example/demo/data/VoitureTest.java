package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

    @Test
    void creerVoiture() {
        assertEquals(1, 1);
    }

    @Test
    void constructeurVide() {
        Voiture v = new Voiture();

        assertEquals(null, v.getMarque());
        assertEquals(0, v.getPrix());
        assertEquals(0, v.getId());
    }

    @Test
    void constructeurAvecParametres() {
    Voiture v = new Voiture("Ferrari", 2000);

    assertEquals("Ferrari", v.getMarque());
    assertEquals(2000, v.getPrix());
}

    @Test
    void testMarque() {
    Voiture v = new Voiture();

    v.setMarque("Peugeot");

    assertEquals("Peugeot", v.getMarque());
}
    @Test
    void testPrix() {
    Voiture v = new Voiture();

    v.setPrix(15000);

    assertEquals(15000, v.getPrix());
}

    @Test
    void testId() {
    Voiture v = new Voiture();

    v.setId(42);

    assertEquals(42, v.getId());
}
    @Test
    void testToString() {
    Voiture v = new Voiture("Ferrari", 2000);
    v.setId(1);

    assertEquals(
            "Car{marque='Ferrari', prix=2000, id=1}",
            v.toString()
    );
}
}

