package Kolokwium_1;

public class Figura {
    private String nazwa;

    public Figura(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Figura {" + "nazwa='" + nazwa + '\t';
    }
}
