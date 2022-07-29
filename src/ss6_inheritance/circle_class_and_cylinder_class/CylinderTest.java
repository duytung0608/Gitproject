package ss6_inheritance.circle_class_and_cylinder_class;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(2.5);
        System.out.println(cylinder);

        cylinder = new Cylinder(2.5,"orange",3);
        System.out.println(cylinder);
    }

}
