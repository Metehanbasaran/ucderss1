package ucderss;

import org.junit.Test;
import static org.junit.Assert.*;
// bu k�s�m�m�z operator api test k�sm�m�zd�r bu yuzden bu class� ac�yorum
public class OperatorApiTest {
	// ilk test kontor yukle k�sm�n� test ediyorum
    @Test
    public void testKonturYukle() {
        TelefonKarti telefonKarti = new TelefonKarti(50.0);
        OperatorApi.konturYukle(telefonKarti, 25.0);
        assertEquals(75.0, telefonKarti.getBakiye(), 0.01);
    }
    //ikinci olarakta testbakiyesorgula k�sm�n� test ediyorum
    @Test
    public void testBakiyeSorgula() {
        TelefonKarti telefonKarti = new TelefonKarti(100.0);
        double bakiye = OperatorApi.bakiyeSorgula(telefonKarti);
        assertEquals(100.0, bakiye, 0.01);
    }
}