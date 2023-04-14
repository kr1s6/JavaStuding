package Kolokwium_1;

public class Romb extends Figura{

    private int a;
    private int h;

    public Romb(String nazwa, int a, int h) {
        super(nazwa);
        this.a = a;
        this.h = h;
    }

    public double obwod(){
        return 4 * this.a;
    }

    public double pole(){
        return this.a * this.h;
    }

    @Override
    public String toString() {
        return super.toString() + "Obwod: " + obwod() + '\t' + "Pole: " + pole() + '}';
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
}
