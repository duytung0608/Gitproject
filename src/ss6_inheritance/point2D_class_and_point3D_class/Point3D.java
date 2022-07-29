package ss6_inheritance.point2D_class_and_point3D_class;

import java.util.Arrays;

public class Point3D extends Point2D{
    float z = 0.0f;
    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float[] getXYZ() {
        return new float[]{x,y,z};
    }
    public String toString() {
        return "A point2D with coordinates = "
                + Arrays.toString(this.getXYZ());
    }
}
