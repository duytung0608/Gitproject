package ss5_access_modifier_static_method_static_property.exercise05.access_modifier;

public class Circle {
    private static double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double getRadius() {
        return radius;
    }

    public String getColor() {
        return this.color;
    }
}
