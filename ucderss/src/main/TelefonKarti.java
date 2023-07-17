public class TelefonKarti {
    private double bakiye;

    public TelefonKarti(double bakiye) {
        this.bakiye = bakiye;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void konturYukle(double miktar) {
        bakiye += miktar;
    }
}