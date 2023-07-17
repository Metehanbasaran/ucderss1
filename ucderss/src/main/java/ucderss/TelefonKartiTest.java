package ucderss;

import org.junit.Test;
import static org.junit.Assert.*;
// bu classýmýz test classýmýz olup test yapýyoruz 
public class TelefonKartiTest {
    //  bu kýsýmdada test kodlarýný yazýyorum cagýrýyorum vs.
	@Test
    public void testKonturYukle() {
        TelefonKarti telefonKarti = new TelefonKarti(50.0);
        telefonKarti.konturYukle(25.0);
        assertEquals(75.0, telefonKarti.getBakiye(), 0.01);
    }
}
