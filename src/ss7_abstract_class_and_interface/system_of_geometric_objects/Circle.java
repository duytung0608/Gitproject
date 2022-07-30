package ss7_abstract_class_and_interface.system_of_geometric_objects;

import ss7_abstract_class_and_interface.resizable_implementation_interface_for_class_students.Resizeable;

public class Circle extends Shape implements Resizeable {
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
}
