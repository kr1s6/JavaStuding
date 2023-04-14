package Kolokwium_1;

import java.util.ArrayList;

public class Geometria {
    public static void main(String[] args){

        ArrayList<Figura> figures = new ArrayList<>();
        figures.add(new Prostokat("prostokat1", 5, 10));
        figures.add(new Prostokat("prostokat2", 2, 6));
        figures.add(new Prostokat("prostokat3", 4, 2));
        figures.add(new Kolo("kolo1", 4));
        figures.add(new Kolo("kolo2", 2));
        figures.add(new Kolo("kolo3", 8));
        figures.add(new Romb("romb1", 5, 10));
        figures.add(new Romb("romb2", 2, 4));
        figures.add(new Romb("romb3", 10, 5));

        for(Figura i: figures){
            System.out.println(i.toString());
        }
    }
}
