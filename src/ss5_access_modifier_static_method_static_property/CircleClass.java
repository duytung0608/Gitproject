package ss5_access_modifier_static_method_static_property;

public class CircleClass {
    private double radius = 0.5;
    private String color = "blue";

    public CircleClass() {
    }

    public CircleClass(double r) {
        radius = r;
    }

    double getRadius() {
        return radius;
    }

    double getArea() {
        return Math.pow(radius,2) * 3.14;
    }
    //tessCircleClass
    public static void main(String[] args) {
        CircleClass circle = new CircleClass(3);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
