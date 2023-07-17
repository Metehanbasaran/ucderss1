package ucderss;
//bu kısıma telefon kartı adında bir class actım
public class TelefonKarti {
    private double bakiye;
//burada telefon kartını gormesı icin ve bakiyeyi göstermesi icin kod yazdım
    public TelefonKarti(double bakiye) {
        this.bakiye = bakiye;
    }
//bu kısımda bakiyeyi döndürüyor
    public double getBakiye() {
        return bakiye;
    }
//bu kısımda kontor yukleyebiliyor
    public void konturYukle(double miktar) {
        bakiye += miktar;
    }
}