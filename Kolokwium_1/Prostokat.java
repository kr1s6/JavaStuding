package Kolokwium_1;

public class Prostokat extends Figura{
    private int a;
    private  int b;

    public Prostokat(String nazwa, int a, int b) {
        super(nazwa);
        this.a = a;
        this.b = b;
    }

    public double obwod(){
        return 2 * this.a + 2 * this.b;
    }

    public double pole(){
        return this.a * this.b;
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

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
