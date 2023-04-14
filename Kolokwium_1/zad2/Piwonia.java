package Kolokwium_1.zad2;

public class Piwonia extends Zielnik {
    public Piwonia(String nazwa, Kolor kolor, Double cana) {
        super(nazwa, kolor, cana);
    }

    @Override
    public String toString() {
        return "Piwonia{" + "nazwa: " + getNazwa() + " kolor:" + getKolor() + " cena:" + getCana() +"}";
    }

}
