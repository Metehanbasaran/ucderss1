package ucderss;
//bu class�m�z operatorapi cllas�m�zd�r bakiye vs. dondurmeye yaarar
public class OperatorApi {
	//miktar� gosterir
    public static void konturYukle(TelefonKarti telefonKarti, double miktar) {
        telefonKarti.konturYukle(miktar);
    }
//telefon kart� bakiyesini g�sterir
    public static double bakiyeSorgula(TelefonKarti telefonKarti) {
        return telefonKarti.getBakiye();
    }
}