package Kolokwium_1.zad2;

public abstract class Zielnik implements Comparable<Zielnik> {

    private final String nazwa;
    private final Kolor kolor;
    private final Double cana;

    public Zielnik(String nazwa, Kolor kolor, Double cana) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.cana = cana;
    }

    public String getNazwa() {
        return nazwa;
    }

    public Kolor getKolor() {
        return kolor;
    }

    public Double getCana() {
        return cana;
    }


    public int compareTo(Zielnik other) {
        return Double.compare(getCana(), other.getCana());
    }
}
