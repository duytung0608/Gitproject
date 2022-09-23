package ss5_access_modifier_static_method_static_property.practice05.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();  //calling change method

        //creating objects
        Student[] students = new Student[3];
        students[0] = new Student(111, "Hoang");
        students[1] = new Student(222, "Khanh");
        students[2] = new Student(333, "Nam");

        //calling display method
        for (Student student : students) {
            student.display();
        }
    }
}
