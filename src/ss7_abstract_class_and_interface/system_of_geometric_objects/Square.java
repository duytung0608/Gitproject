package ss7_abstract_class_and_interface.system_of_geometric_objects;

import ss7_abstract_class_and_interface.resizable_implementation_interface_for_class_students.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square() {
    }

    public Square(double side) {
        super(side,side);
    }

    public Square(double side, String color, boolean filled) {
        super(side,side,color,filled);
    }

    public double getSide() {
        return getWidth();
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    public void setLength(double length) {
        setSide(length);
    }

    public double getArea() {
        return getSide()*getSide();
    }

    public String toString() {
        return "A Square with side="
                + getSide()
                + " and Area= "
                + getArea()
                + ", which is a subclass of "
                + super.toString();
    }
}
