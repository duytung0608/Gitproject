package ss4_class_and_object_in_java.exercise4;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }
    public double getDiscriminant() {
        double delta = Math.pow(this.b,2) - (4*this.a*this.c);
        return delta;
    }
    public double getRoot1() {
        double r1 = ((-1)*this.b + Math.pow(Math.pow(this.b,2)-(4*this.a*this.c),0.5))/(2*this.a);
        return r1;
    }
    public  double getRoot2() {
        double r2 = ((-1)*this.b - Math.pow(Math.pow(this.b,2)-(4*this.a*this.c),0.5))/(2*this.a);
        return r2;
    }

    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = input.nextDouble();
        System.out.println("Enter b: ");
        b = input.nextDouble();
        System.out.println("Enter c: ");
        c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta>0) {
            System.out.println(quadraticEquation.getRoot1());
            System.out.println(quadraticEquation.getRoot2());
        } else if (delta==0) {
            System.out.println(quadraticEquation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

    }

}
