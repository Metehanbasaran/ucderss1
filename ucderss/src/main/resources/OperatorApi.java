public class OperatorApi {
    public static void konturYukle(TelefonKarti telefonKarti, double miktar) {
        telefonKarti.konturYukle(miktar);
    }

    public static double bakiyeSorgula(TelefonKarti telefonKarti) {
        return telefonKarti.getBakiye();
    }
}