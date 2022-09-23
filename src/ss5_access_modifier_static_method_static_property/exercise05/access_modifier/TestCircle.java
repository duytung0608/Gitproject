package ss5_access_modifier_static_method_static_property.exercise05.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getRadius()); // Circle or circle1 đều gọi được!!!

        Circle circle2 = new Circle();
        System.out.println(circle2.getRadius());
    }
}
