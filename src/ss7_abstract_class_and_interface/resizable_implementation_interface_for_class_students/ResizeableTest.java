package ss7_abstract_class_and_interface.resizable_implementation_interface_for_class_students;

import ss7_abstract_class_and_interface.system_of_geometric_objects.Circle;
import ss7_abstract_class_and_interface.system_of_geometric_objects.Rectangle;
import ss7_abstract_class_and_interface.system_of_geometric_objects.Square;

// ba lớp circle ... nằm ở package system_of_geometric_object

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
