package ss6_inheritance.exercise06.point_class_and_moveable_point;

import java.util.Arrays;

public class MovablePoint extends Point{
    float ySpeed = 0.0f;
    float xSpeed = 0.0f;

    public MovablePoint(float x, float y, float ySpeed, float xSpeed) {
        super(x,y);
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public MovablePoint(float ySpeed, float xSpeed) {
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public MovablePoint() {
    }

    public float getySpeed() {
        return ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[] {xSpeed,ySpeed};
    }
    public String toString() {
        return "A Movepoint with x,y = "
                + Arrays.toString(this.getXY())
                + "and speed = "
                + Arrays.toString(this.getSpeed());
    }
    public MovablePoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
