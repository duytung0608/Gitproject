package ss6_inheritance.practice06.system_of_geometric_objects_06.shape;

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        shape = new Shape("red", false);
        System.out.println(shape);
    }
}
