package ss4_class_and_object_in_java.practice4;


import java.util.Scanner;

public class RectangleClass {
    double width, height;

    public RectangleClass() {
    }
    public RectangleClass(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangel{" + "width= " + width + ", height= " + height + "}";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the height:");
        double height = Double.parseDouble(scanner.nextLine());
        RectangleClass rectangle = new RectangleClass(width, height);
        RectangleClass rectangle2 = new RectangleClass();
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle:" + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle:" + rectangle.getArea());
        System.out.println(rectangle);
        System.out.println(rectangle2);
    }
}
