package ss6_inheritance.practice06.system_of_geometric_objects_06.circle;

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Shape;
import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.colorable.Colorable;
import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.resizeable.Resizeable;

public class Circle extends Shape implements Resizeable, Colorable {
    double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + " and Area = "
                + getArea()
                + ",Which is a subclass of "
                + super.toString();
    }

    public void resize(double perccent) {
        this.radius += this.radius * (perccent/100);
    }

    public String howToColor() {
        return "Color of inside";
    }

   /* public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println(circle);
    }
    */
}
