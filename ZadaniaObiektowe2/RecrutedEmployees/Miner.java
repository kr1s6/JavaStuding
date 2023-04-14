package ZadaniaObiektowe2.RecrutedEmployees;

public class Miner extends Employee {
    private int strength;

    public Miner(String name, int age, String town, String mail, String tel_number, int strength) {
        super(name, age, town, mail, tel_number);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Miner: " + super.toString() + "strength=" + strength ;
    }
}
