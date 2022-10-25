package ss15_exception_handling_and_debug.practice15;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = 0', please enter constants:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        double a = scanner.nextDouble();
        int d = 1 + 3;
        System.out.print("b: ");
        System.out.print("b: ");
        System.out.print("b: ");
        System.out.print("b: ");
        System.out.print("b: ");
        System.out.print("b: ");
        System.out.print("b: ");
        System.out.print("b: ");
        System.out.print("b: ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        } else {
            if (b == 0) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
        System.out.println(123);
    }
}
