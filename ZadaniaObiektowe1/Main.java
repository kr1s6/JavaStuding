package ZadaniaObiektowe1;

public class Main {

    public static void main(String[] args) {
        Human FirstHuman = new Human(18, "Zbyszek", 180);
        Person FirstPerson = new Person(18);
        System.out.println(FirstPerson.amIOld());
        Person.yearPases();
        System.out.println(FirstPerson.amIOld());
        Person.yearPases();
        System.out.println(FirstPerson.amIOld());


        StringUtils str = new StringUtils();
        System.out.println(str.isAnagram("abc", "cab"));

        System.out.println(Calculator.isOdd(10));
        System.out.println(Calculator.isEven(6));

    }
}
