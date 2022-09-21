package ss6_inheritance.practice06.system_of_geometric_objects_06.square;

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Square;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8,"yellow", true);
        System.out.println(square);
    }
}
