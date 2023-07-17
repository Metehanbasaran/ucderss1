package ucderss;

import org.junit.Test;
import static org.junit.Assert.*;
// bu class�m�z test class�m�z olup test yap�yoruz 
public class TelefonKartiTest {
    //  bu k�s�mdada test kodlar�n� yaz�yorum cag�r�yorum vs.
	@Test
    public void testKonturYukle() {
        TelefonKarti telefonKarti = new TelefonKarti(50.0);
        telefonKarti.konturYukle(25.0);
        assertEquals(75.0, telefonKarti.getBakiye(), 0.01);
    }
}
