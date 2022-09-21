package ss4_class_and_object_in_java.exercise4;

public class BuildFanClass {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    private boolean on = false;
    private double radius;
    private String color = "blue";

    public short getSLOW() {
        return SLOW;
    }

    public short getMEDIUM() {
        return MEDIUM;
    }

    public short getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOn()) {
            return "Speed: " + getSpeed() + "\nColor: " + getColor() + "\nRadius: " + getRadius() +"\nfan is on";
        } else return "Color: " + getColor() + "\nRadius: " + getRadius() + "\nfan is off";
    }

    public static void main(String[] args) {
        BuildFanClass fan1 = new BuildFanClass();
        fan1.setSpeed(fan1.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);

        BuildFanClass fan2 = new BuildFanClass();
        fan2.setSpeed(fan2.MEDIUM);
        fan2.setRadius(5);

        System.out.println("Fan 1:\n" + fan1.toString());
        System.out.println();
        System.out.println("Fan 2:\n" + fan2.toString());
    }

}
