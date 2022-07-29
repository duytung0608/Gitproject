package ss6_inheritance.circle_class_and_cylinder_class;

public class Circle {
    double radius;
    String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "pink";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + " and with color of "
                + getColor();
    }
}
