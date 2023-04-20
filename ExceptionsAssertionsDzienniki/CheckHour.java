package ExceptionsAssertionsDzienniki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckHour {

    //throw new MyNewExceptions
    //throws Exception
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Type hour: ");
        try {
            int hour = input.nextInt();
            if(hour < 24 && hour > 0)
                throw new IllegalArgumentException("Hour must be in range 0-24!");
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
        catch (InputMismatchException e){
            System.out.println(e + "--" + "You can type only int value!");
        }
        finally {
            System.out.println("Do zobaczenia jutro!");
        }


    }
}
