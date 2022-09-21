package ss7_abstract_class_and_interface.practice07.circle_comparable_and_comparator;

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Circle;

public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle>{

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, double radius) {
        super(color,filled,radius);
    }

    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}
