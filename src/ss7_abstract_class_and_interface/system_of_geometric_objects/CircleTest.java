package ss7_abstract_class_and_interface.system_of_geometric_objects;

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo",false, 3.5);
        System.out.println(circle);
    }
}
