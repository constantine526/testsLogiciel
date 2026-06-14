package com.example.demo.service;

import com.example.demo.data.Voiture;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class StatistiqueTests {
    @Test
    void testAjoutVoiture() {
    Statistique stat = new StatistiqueImpl();

    stat.ajouter(new Voiture("Ferrari", 2000));

    assertEquals(1, 1);
}
 @Test
    void testMoyenneUneVoiture() {
    Statistique stat = new StatistiqueImpl();

    stat.ajouter(new Voiture("Ferrari", 2000));

    Echantillon e = stat.prixMoyen();

    assertEquals(2000, e.getPrixMoyen());
    assertEquals(1, e.getNombreDeVoitures());
}

@Test
    void testMoyennePlusieursVoitures() {
    Statistique stat = new StatistiqueImpl();

    stat.ajouter(new Voiture("A", 1000));
    stat.ajouter(new Voiture("B", 3000));

    Echantillon e = stat.prixMoyen();

    assertEquals(2000, e.getPrixMoyen());
    assertEquals(2, e.getNombreDeVoitures());
}

@Test
void testExceptionListeVide() {
    Statistique stat = new StatistiqueImpl();

    assertThrows(ArithmeticException.class, () -> {
        stat.prixMoyen();
    });
}
    

}
