package ss2_loop_in_java;

import java.util.Scanner;

public class DisplayTypes {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("What image do you want to show?");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println("Enter longs: ");
                    double longs = input.nextDouble();
                    System.out.println("Enter width: ");
                    double width = input.nextDouble();
                    for (int i=1; i<=width; i++) {
                        for (int j=1; j<=longs; j++) {
                            System.out.print("#");
                        }
                        System.out.print("\n");
                    }
                    break;
                }
                case 2: {
                    System.out.println("Do you want to choose botton-left of top-left");
                    System.out.println("11. Botton - Left");
                    System.out.println("12. Top - Left");
                    int choice2 = input.nextInt();
                    switch (choice2) {
                        case 11: {
                            System.out.println("Enter height: ");
                            double height = input.nextDouble();
                            for (int i=1;i<=height;i++) {
                                for (int j=1;j<=i;j++) {
                                    System.out.print("#");
                                }
                                System.out.println("\n");
                            }
                            break;
                        }
                        case 12: {
                            System.out.println("Enter height: ");
                            double height2 = input.nextDouble();
                            for (double i = height2;i>0;i--) {
                                for (int j=1;j<=i;j++) {
                                    System.out.print("#");
                                }
                                System.out.println("\n");
                            }
                            break;
                        }
                        default: {
                            System.out.println("No choice2!!!");
                            System.exit(0);
                        }
                    }
                    break;
                }
                case 3: {
                    int height3;
                    System.out.println("Enter height: ");
                    //height3 = Integer.parseInt(input.nextLine()); vì sao như vậy nó báo lỗi ảo quá !!!
                    height3 = input.nextInt();
                    for (int i=1;i<=height3;i++) {
                        for (int j=1;j<height3+1-i;j++)
                            System.out.print(" ");
                        for (int k=1;k<=2*i-1;k++)
                            System.out.print("*");
                        System.out.print("\n");
                    }
                    break;
                }
                case 4: {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("No choice!!!");
            }

        } while (choice!=4);
    }
}
