package ss7_abstract_class_and_interface.resizable_colorable;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(2);
        shapes[1] = new Rectangle(3,4);
        shapes[2] = new Square(5);

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.println((Square)shape);
                System.out.println(((Square) shape).howToColor());
            }
            System.out.println();
        }
    }
}
