package ZadaniaObiektowe;

public class Human {

    int age;
    int height;
    String name;

    public Human(int age, String name, int height){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Human(int age, int height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
