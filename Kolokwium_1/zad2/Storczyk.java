package Kolokwium_1.zad2;

public class Storczyk extends Zielnik{

    public Storczyk(String nazwa, Kolor kolor, Double cana) {
        super(nazwa, kolor, cana);
    }


    @Override
    public String toString() {
        return "Storczyk{" + "nazwa: " + getNazwa() + " kolor:" + getKolor() + " cena:" + getCana() +"}";
    }

}
