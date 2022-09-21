package ss7_abstract_class_and_interface.system_of_geometric_objects;

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
