package Kolokwium_1.zad2;

public class Konwalia extends Zielnik {
    public Konwalia(String nazwa, Kolor kolor, Double cana) {
        super(nazwa, kolor, cana);
    }

    @Override
    public String toString() {
        return "Konwalia{" + "nazwa: " + getNazwa() + " kolor:" + getKolor() + " cena:" + getCana() +"}";
    }

}
