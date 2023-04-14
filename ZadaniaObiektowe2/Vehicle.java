package ZadaniaObiektowe2;

public abstract class Vehicle {
    private String name = "";
    private int number = 0;
    private Level level = Level.MEDIUM;

    public Vehicle(String n, int num, Level level) {
        this.name = n;
        this.number = num;
        this.level = level;
    }

    public Vehicle() {

    }

    public String getPrice(){
        return (this.number * 1000 + "zł");
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public Level getLevel() {
        return level;
    }
}
