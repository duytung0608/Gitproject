package ss6_inheritance.point2D_class_and_point3D_class;

import java.util.Arrays;

public class Point2D {
    float x = 0.0f;
    float y = 0.0f;
    public Point2D() {
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x,y};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "A point2D with coordinates = "
                + Arrays.toString(this.getXY());
    }
}
