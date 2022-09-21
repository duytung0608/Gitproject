package ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.colorable;

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Circle;
import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Rectangle;
import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Square;
import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Shape;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new Square(5);

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println((Circle)shape);
                System.out.println(((Circle) shape).howToColor());
            }
            System.out.println();
        }
    }
}
