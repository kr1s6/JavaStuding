package Lab4_Interfejsy;

public class Bike implements Movable, Measurable{
    private int weight;
    public Bike(int weight) {
        this.weight = weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return this.weight;
    }

    @Override
    public void start() {
        System.out.println("Bike start");
    }

    @Override
    public void stop() {
        System.out.println("Bike stop");
    }
}
