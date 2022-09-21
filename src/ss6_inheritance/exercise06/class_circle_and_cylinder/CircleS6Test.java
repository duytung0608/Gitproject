package ss6_inheritance.exercise06.class_circle_and_cylinder;

public class CircleS6Test {
    public static void main(String[] args) {
        CircleS6[] circles = new CircleS6[3];
        circles[0] = new CircleS6();
        circles[1] = new CircleS6(3);
        circles[2] = new CircleS6(true, "indigo",4 );

        for (CircleS6 circle : circles) {
            System.out.println(circle);
        }
    }
}
