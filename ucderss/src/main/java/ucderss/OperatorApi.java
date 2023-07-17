package ucderss;
//bu classýmýz operatorapi cllasýmýzdýr bakiye vs. dondurmeye yaarar
public class OperatorApi {
	//miktarý gosterir
    public static void konturYukle(TelefonKarti telefonKarti, double miktar) {
        telefonKarti.konturYukle(miktar);
    }
//telefon kartý bakiyesini gösterir
    public static double bakiyeSorgula(TelefonKarti telefonKarti) {
        return telefonKarti.getBakiye();
    }
}