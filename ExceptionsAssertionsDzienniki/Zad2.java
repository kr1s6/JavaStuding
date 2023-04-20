package ExceptionsAssertionsDzienniki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        try{
            int number = input.nextInt();
            if(number > 100)
                throw new TooFarException();
        }
        catch (TooFarException e){
            System.out.println(e.toString());
        }
        catch (InputMismatchException e){
            System.out.println(e + " You should type int number");
        }
    }
}
