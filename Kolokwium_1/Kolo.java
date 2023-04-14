package Kolokwium_1;

public class Kolo extends Figura{
    public static final double PI = 3.14;
    private int r;

    public Kolo(String nazwa, int r) {
        super(nazwa);
        this.r = r;
    }

    public double obwod(){
        return 2 * PI * this.r;
    }

    public double pole(){
        return Math.pow((PI * this.r), 2);
    }

    @Override
    public String toString() {
        return super.toString() + "Obwod: " + obwod() + '\t' + "Pole: " + pole() + '}';
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
