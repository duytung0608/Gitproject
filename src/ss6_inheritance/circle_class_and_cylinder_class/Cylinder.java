package ss6_inheritance.circle_class_and_cylinder_class;

public class Cylinder extends Circle{
    double height;

    public Cylinder() {
        this.height = 2.0;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return getArea()*height;
    }

    public String toString() {
        return "A Circle with height="
                + getHeight()
                + ",Which is a subclass of "
                + super.toString();
    }
}
