package ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable;

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.colorable.Colorable;
import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.resizeable.Resizeable;

public class Square extends Rectangle implements Resizeable, Colorable {
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

    public String howToColor() {
        return "Color all four sides.";
    }
}
