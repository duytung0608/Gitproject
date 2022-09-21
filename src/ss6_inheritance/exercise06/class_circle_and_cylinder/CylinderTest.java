package ss6_inheritance.exercise06.class_circle_and_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder[] cylinders = new Cylinder[3];
        cylinders[0] = new Cylinder();
        cylinders[1] = new Cylinder(3,4.2);
        cylinders[2] = new Cylinder(5.4,2.5,"green",true);

        for (Cylinder cylinder : cylinders) {
            System.out.println(cylinder);
        }
    }
}
