package ZadaniaObiektowe2;

public class Tricycle extends Vehicle{
    public Tricycle(String name, int number, Level level) {
        super(name, number, level);
    }

    @Override
    public String toString() {
        return "Tricycle: " + super.getName() +
                "\nNumber of wheels: " + super.getNumber() +
                "\nPrice: " + super.getPrice() +
                "\nLevel: " + super.getLevel();
    }

    @Override
    public boolean equals(Object name) {
        return super.equals(name);
    }
}
