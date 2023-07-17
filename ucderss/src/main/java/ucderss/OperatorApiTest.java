package ucderss;

import org.junit.Test;
import static org.junit.Assert.*;
// bu kýsýmýmýz operator api test kýsmýmýzdýr bu yuzden bu classý acýyorum
public class OperatorApiTest {
	// ilk test kontor yukle kýsmýný test ediyorum
    @Test
    public void testKonturYukle() {
        TelefonKarti telefonKarti = new TelefonKarti(50.0);
        OperatorApi.konturYukle(telefonKarti, 25.0);
        assertEquals(75.0, telefonKarti.getBakiye(), 0.01);
    }
    //ikinci olarakta testbakiyesorgula kýsmýný test ediyorum
    @Test
    public void testBakiyeSorgula() {
        TelefonKarti telefonKarti = new TelefonKarti(100.0);
        double bakiye = OperatorApi.bakiyeSorgula(telefonKarti);
        assertEquals(100.0, bakiye, 0.01);
    }
}