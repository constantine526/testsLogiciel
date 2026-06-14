package com.example.demo.data;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class VoitureTest {

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
}
}
