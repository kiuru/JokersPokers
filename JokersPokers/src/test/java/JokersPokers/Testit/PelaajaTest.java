/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test.java.JokersPokers.Testit;

import main.java.JokersPokers.Kortti.Kortti;
import main.java.JokersPokers.Kortti.Korttipakka;
import main.java.JokersPokers.Pelaaja.Pelaaja;
import main.java.JokersPokers.Pelaaja.Pelivaraukset;
import main.java.JokersPokers.Pelaaja.Pokerikasi;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Jomppa
 */
public class PelaajaTest {

    Pelaaja hero = new Pelaaja();   
    Korttipakka pakka = new Korttipakka();

            public PelaajaTest () {
       pakka.luoKorttipakka();
            }
            
            
    @Test
    public void PelivarauksenSet() {
    hero.setRollit(5);
    assertEquals(5.00,00 , hero.getPelivaraukset().getRahat());
    }
    
    @Test
    public void PokerikadenLuonti() {
    hero.luoPelikasi(pakka);
    assertEquals(5 , hero.getHanska().getKorttienlkmKadessa());
    }
    
    @Test
    public void kortinVaihto() {
        hero.luoPelikasi(pakka);
        String vanhaHanska = hero.getHanska().toString();
        Kortti kortti = hero.getHanska().getViimeinenKortti();
        hero.getHanska().vaihdaKortti(pakka, kortti);
        assertFalse("samat on", hero.getHanska().toString().equals(vanhaHanska));
        
    }
    
    @Test
    public void negatiivinenRaha () {
     hero.setRollit(-5);
    assertEquals(0.00,00 , hero.getPelivaraukset().getRahat());
    }
    
    @Test
    public void valmiinKadenTuonti () {
    Pokerikasi kasi = new Pokerikasi();
    kasi.luoPokeriKasi(pakka);
    hero.setHanska(kasi);
    assertTrue("Ei oo samat" , hero.getHanska().toString().equals(kasi.toString()));
    }

}
