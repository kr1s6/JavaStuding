package ZadaniaObiektowe1;

public class Person {
    private static int age;

    public Person(int age){Person.age = age;
    }

    public int getAge(){return age;
    }

    public static void yearPases(){Person.age += 1;
    }

    public String amIOld(){
        if (age <= 19) {
            return "Teenager";
        }
        else{
            return "Adult";
        }

    }
}

