package ZadaniaObiektowe1;

public class Calculator {
    static double PI = 3.14;
    static double e = 6.18;

//boolean isOdd(int number) - true jeśli atrybut jest nieparzysty,
    //boolean isEven(int number) - true jeśli atrybut jest parzysty,

    public static Boolean isOdd(int number){
        return number % 2 != 0;
    }

    public static Boolean isEven(int number){
        return number % 2 == 0;
    }
}
