package ss6_inheritance.exercise06.point_class_and_moveable_point;

public class TestMovePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(4,5);
        System.out.println(movablePoint);

        movablePoint = new MovablePoint(3,4,5,6);
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
