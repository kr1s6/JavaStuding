package ZadaniaObiektowe2.RecrutedEmployees;

public abstract class Employee {
    private static int nextId = 1;
    private String name;
    private int age;
    private String town;
    private String mail;
    private String tel_number;
    private final int id;

    {
        this.id = nextId;
        nextId++;
    }

    public Employee(String name, int age, String town, String mail, String tel_number) {
        this.name = name;
        this.age = age;
        this.town = town;
        this.mail = mail;
        this.tel_number = tel_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTel_number() {
        return tel_number;
    }

    public void setTel_number(String tel_number) {
        this.tel_number = tel_number;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name=" + name +
                ", age=" + age +
                ", town=" + town +
                ", mail=" + mail +
                ", tel_number=" + tel_number;
    }
}
