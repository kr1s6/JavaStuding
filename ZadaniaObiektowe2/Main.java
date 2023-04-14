package ZadaniaObiektowe2;
import java.io.Console;
import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //Zadanie 1
        String[] colorsTab = {"red", "blue", "black", "pink", "purple"};
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("White");
        colorsList.add("Black");
        colorsList.add("Pink");
        colorsList.add("Blue");
        colorsList.add("Red");

        System.out.println(Arrays.toString(colorsTab));
        System.out.println(colorsList);

        colorsList.add(0, "Grey");
        colorsList.remove(colorsList.size() -1);
        colorsList.remove(colorsList.size() -1);
        System.out.println("Czy istnieje kolor Black? " + colorsList.contains("Black"));
        for(String i: colorsTab){
            boolean x = i.equals("black");
            if (x) {
                System.out.println("Black exists in colorsTab\n");
                break;
            }
        }

        //Zadanie 2
        Car car = new Car("Mustang", 4, Level.LOW);
        Motorcycle motor = new Motorcycle("Takietam", 2, Level.HARD);
        Tricycle tri = new Tricycle("Trojkotszybki", 3, Level.MEDIUM);
        System.out.println(car + "\n");
        System.out.println(motor + "\n");
        System.out.println(tri);

        System.out.println();
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(motor);
        vehicles.add(tri);
        for(Vehicle i: vehicles){
            System.out.println(i.getName() +" price: "+ i.getPrice());
        }


        String nowa = "\nSiemanoKolano";
        String kolano = nowa.substring(nowa.length() - 6);
        System.out.println(kolano);

//        Scanner in = new Scanner(System.in);
//        System.out.println("Podaj imię: ");
//        String name = in.nextLine();
//        System.out.println("How old are you?");
//        int age = in.nextInt();
//        System.out.println("Hello " + name + "! Next year you will be " + (age + 1) + " years old");

//        Console cons = System.console();
//        String username = cons.readLine("Username: ");
//        char[] passwd = cons.readPassword("Password: ");

        System.out.printf("Number %,.2f", 10000.0/3.0);
        System.out.println();

        System.out.println(LocalDate.now());
        System.out.println(new Date());
        LocalDate dd = LocalDate.of(1999, 12, 31);
        System.out.println(dd.getDayOfYear());
        System.out.println(LocalDate.of(1999, 12, 31));
        LocalDate aThousandDaysLater = dd.plusDays(1000);
        System.out.println(aThousandDaysLater);

        LocalDate date = LocalDate.now();
        int today = date.getDayOfMonth();
        int month = date.getMonthValue();
        date = date.minusDays(today-1);
        DayOfWeek weekday = date.getDayOfWeek();
        System.out.println(weekday);
        int value = weekday.getValue();
        System.out.println(value);
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 0; i < value; i++){
            System.out.print("   ");
        }
        while(date.getMonthValue() == month){
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }

        //Zadanie 3








    }
}
