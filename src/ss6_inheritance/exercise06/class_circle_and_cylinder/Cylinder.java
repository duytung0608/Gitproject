package ss6_inheritance.exercise06.class_circle_and_cylinder;

public class Cylinder extends CircleS6{
    private double height = 1.0;

    public Cylinder() {
    }

    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double height, double radius, String color, boolean filled) {
        super(filled, color, radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.area*height;
    }

    public String toString() {
        return "A Cylinder with height = "
                + getHeight()
                + " and volume = "
                + getVolume()
                + " and is a subclass of "
                + super.toString();

    }

}
