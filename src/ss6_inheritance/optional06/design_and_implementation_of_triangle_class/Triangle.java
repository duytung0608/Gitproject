package ss6_inheritance.optional06.design_and_implementation_of_triangle_class;

public class Triangle extends Shape{
    double side1 = 1.0;
    double side2 = 1.0;
    double side3 = 1.0;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getArea() {
        double halfOfPerimeter = (side1+side2+side3)/2;
        double caculator = halfOfPerimeter*(halfOfPerimeter-side1)*(halfOfPerimeter-side2)*(halfOfPerimeter-side3);
        return Math.pow(caculator,1/2);
    }
    public double getPerimeter() {
        return side1+side2+side3;
    }
    public String toString() {
        return "A Triangle with Area = "
                + getArea();
    }
}
