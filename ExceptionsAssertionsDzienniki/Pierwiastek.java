package ExceptionsAssertionsDzienniki;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Pierwiastek {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.print("Give number: ");
            try {
                double num = Double.parseDouble(input.nextLine());
                if (num < 0)
                    throw new IllegalArgumentException("NUmber should be > 0");
                double sqrt = sqrt(num);
                System.out.print(sqrt);
                break;
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println(e);
            }
        }

    }
}
