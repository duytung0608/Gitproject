package ss6_inheritance;

import ss7_abstract_class_and_interface.resizable_colorable.Circle;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle>  { //Comparable sắp xếp nhưng sắp xếp như thế nào hay theo 1 cái phương thức như nào thì ta truyền vào cho nó <ComparableCircle> tức là sắp xếp theo ComparableCircle
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }
    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }

    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}
