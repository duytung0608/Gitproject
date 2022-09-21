package ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.resizeable;

// ba lớp circle ... nằm ở package system_of_geometric_object

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Circle;
import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Rectangle;
import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Resizeable[] resizeables = new Resizeable[3];
        resizeables[0] = new Circle();
        resizeables[1] = new Rectangle();
        resizeables[2] = new Square();

        System.out.println("Pre-increasing: ");
        for (Resizeable resizeable : resizeables) {
            System.out.println(resizeable);
        }

        System.out.println("After-increasing: ");
        for (Resizeable resizeable : resizeables) {
            resizeable.resize(75);
        }
        for (Resizeable resizeable : resizeables) {
            System.out.println(resizeable);
        }
    }
}
