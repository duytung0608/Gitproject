package ss6_inheritance.practice06.system_of_geometric_objects_06.rectangle;

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Rectangle;

public class RectangeTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3,5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle(2.5,3.8,"orange",true);
        System.out.println(rectangle);
    }
}
