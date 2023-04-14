package ZadaniaObiektowe2.RecrutedEmployees;

public class Doctor extends Employee{
    private String academicDegree;

    public Doctor(String name, int age, String town, String mail, String tel_number, String academicDegree) {
        super(name, age, town, mail, tel_number);
        this.academicDegree = academicDegree;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    @Override
    public String toString() {
        return "Doctor: " + super.toString() + "academicDegree=" + academicDegree;
    }
}
