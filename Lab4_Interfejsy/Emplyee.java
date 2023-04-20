package Lab4_Interfejsy;


public class Emplyee implements Comparable<Emplyee> {
    private final double salary;
    private static int nextId = 1;
    private final int id;
    private final String name;

    {
        this.id = nextId;
        nextId++;
    }
    public Emplyee(double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Emplyee{" +
                "salary=" + getSalary() +
                ", id=" + getId() +
                ", name='" + getName() + '\'' +
                '}';
    }

    public int compareTo(Emplyee other) {
        return Double.compare(salary, other.salary);
    }
}
