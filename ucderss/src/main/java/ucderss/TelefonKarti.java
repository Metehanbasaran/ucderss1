package ucderss;
//bu k�s�ma telefon kart� ad�nda bir class act�m
public class TelefonKarti {
    private double bakiye;
//burada telefon kart�n� gormes� icin ve bakiyeyi g�stermesi icin kod yazd�m
    public TelefonKarti(double bakiye) {
        this.bakiye = bakiye;
    }
//bu k�s�mda bakiyeyi d�nd�r�yor
    public double getBakiye() {
        return bakiye;
    }
//bu k�s�mda kontor yukleyebiliyor
    public void konturYukle(double miktar) {
        bakiye += miktar;
    }
}