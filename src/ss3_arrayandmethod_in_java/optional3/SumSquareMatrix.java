package ss3_arrayandmethod_in_java.optional3;

import java.util.Scanner;

public class SumSquareMatrix {
    public static void main(String[] args) {
        double[][] array;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height: ");
        int height = input.nextInt();
        System.out.println("Enter longs: ");
        int longs = input.nextInt();
        array = new double[height][longs];
        for (int i=0;i<height;i++) {
            for (int j=0;j<longs;j++) {
                System.out.print("Enter element array["+i+"]["+j+"]: ");
                array[i][j] = input.nextDouble();
            }
        }
        for (int i=0;i<height;i++) {
            for (int j=0;j<longs;j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        for (int i=0;i<height;i++) {
            for (int j=0;j<longs;j++) {
                if (i==j) {
                    sum+=array[i][j];
                }
            }
        }
        System.out.println("Sum ís: " + sum);
    }
}
