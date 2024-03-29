package ss7_abstract_class_and_interface.practice07.circle_comparable_and_comparator;

import ss7_abstract_class_and_interface.exercise07.resizeable_and_colorable.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {

    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
