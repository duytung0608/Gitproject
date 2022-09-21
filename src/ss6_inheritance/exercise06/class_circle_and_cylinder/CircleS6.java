package ss6_inheritance.exercise06.class_circle_and_cylinder;

public class CircleS6 {
    public boolean filled = false;
    public double radius = 1.0;
    public String color = "No color";
    final double PI = 3.14;
    public double area = radius*radius*PI;


    public CircleS6() {
    }

    public CircleS6(double radius) {
        this.radius = radius;
        this.area = radius*radius*PI;
    }

    public CircleS6(boolean filled, String color, double radius) {
        this.radius = radius;
        this.area = radius*radius*PI;
        this.filled = filled;
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return  "A Circle with radius="
                + getRadius()
                + " and Area = "
                + getArea()
                + " and color is "
                + getColor()
                + " and "
                + (isFilled() ? "filled" : "not filled");
    }
}
