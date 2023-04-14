package Kolokwium_1.zad2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Zielnik> zielnik = new ArrayList<>();

        end:
        while (true) {
            System.out.println("""
                    1 - dodaj do zielnika dowolne wpisy
                    2 - dodaj nowy kwiat
                    3 - wyświetl zielnik
                    4 - posortuj dane po polu cena
                    0 - wyjdź z programu
                    """);
            Scanner in = new Scanner(System.in);
            Scanner inn = new Scanner(System.in);
            int x = in.nextInt();
            switch (x) {
                case 1:
                    zielnik.add(new Roza("RozaFajna", Kolor.RED, 15.20));
                    zielnik.add(new Storczyk("SuperRoza", Kolor.PINK, 20.00));
                    break;
                case 2:
                    System.out.println("""
                            Which flower you want to add?
                            a - Roza
                            b - Storczyk
                            c - Konwalia
                            d - Piwonia
                            e - [Exit]
                            """);
                    String kwait = in.next();
                    if (kwait.equals("e")) {
                        break;
                    }
                    System.out.print("Name: ");
                    String name = inn.nextLine();
                    System.out.print("Price: ");
                    double price = in.nextDouble();
                    switch (kwait) {
                        case "a":
                            zielnik.add(new Roza(name, Kolor.RED, price));
                        case "b":
                            zielnik.add(new Storczyk(name, Kolor.RED, price));
                            break;
                        case "c":
                            zielnik.add(new Konwalia(name, Kolor.RED, price));
                            break;
                        case "d":
                            zielnik.add(new Piwonia(name, Kolor.RED, price));
                            break;
                        default:
                    }
                    break;
                case 3:
                    for (Zielnik i : zielnik) {
                        System.out.println(i.toString());
                    }
                    break;
                case 4:
                    Collections.sort(zielnik);
                    break;
                case 0:
                    break end;
                default:
            }
        }
    }
}
