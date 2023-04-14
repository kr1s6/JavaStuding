package Kolokwium_1.zad2;

public class Roza extends Zielnik {
    public Roza(String nazwa, Kolor kolor, Double cana) {
        super(nazwa, kolor, cana);
    }

    @Override
    public String toString() {
        return "Roza{" + "nazwa: " + getNazwa() + " kolor:" + getKolor() + " cena:" + getCana() +"}";
    }

}
