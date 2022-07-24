package ss5_access_modifier_static_method_static_property;

public class StudentClass {
    private String name = "John";
    private String classes = "C02";

    public StudentClass() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
    //TestStudentClass
    public static void main(String[] args) {
        StudentClass student = new StudentClass();

        student.setName("Duy Tung");
        student.setClasses("A0422I1");

    }
}
