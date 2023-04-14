package ZadaniaObiektowe2;

public class Car extends Vehicle{
    public Car(String name, int number, Level level) {
        super(name, number, level);
    }

    @Override
    public String toString() {
        return "Car: " +
                super.getName() +
                "\nNumber of wheels: " +
                super.getNumber() +
                "\nPrice: " +
                super.getPrice() +
                "\nLevel: " +
                super.getLevel();
    }

    @Override
    public boolean equals(Object name) {
        return super.equals(name);
    }
}
