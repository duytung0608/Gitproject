package ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable;

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.resizeable.Resizeable;

public class Rectangle extends Shape implements Resizeable {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }
    public String toString() {
        return "A Retangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + " and Area= "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }
    public void resize(double percent) {
        this.width += this.width*(percent/100);
        this.length += this.length*(percent/100);
    }
}
