package ZadaniaObiektowe2;

public class Motorcycle extends Vehicle{
    public Motorcycle(String name, int number, Level level) {
        super(name, number, level);
    }

    @Override
    public String toString() {
        return "Motorcycle: " + super.getName() +
                "\nNumber of wheels: " + super.getNumber() +
                "\nPrice: " + super.getPrice() +
                "\nLevel: " + super.getLevel();
    }

    @Override
    public boolean equals(Object name) {
        return super.equals(name);
    }
}
