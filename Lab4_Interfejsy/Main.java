package Lab4_Interfejsy;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args){
        Car car = new Car(400);
        Bike bike = new Bike(30);

        invoke(car);
        invoke(bike);
        Measurable lambda = () -> 55;
        invoke(lambda);


        var dni = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Satruday", "Sunday"};
        Arrays.sort(dni, (a, b) -> a.length() - b.length());
        for(String i: dni){
            System.out.println(i);
        }



       long counter = Stream.of("Kraków", "Gdynia",
                        "Warszawa", "Wrocław", "Poznań", "Katowice")
                .filter(x -> x.length() == 6)
                .count();

        System.out.println(counter);
    }

    static void invoke(Measurable measurable){
        System.out.println(measurable.getWeight());
    }
}
