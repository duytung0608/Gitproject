package ss3_arrayandmethod_in_java;

import java.util.Scanner;

public class SumTheNumbersInASpecifiedColumn {
    public static void main(String[] args) {
        double[][] array;
        int location;
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height: ");
        int height = input.nextInt();
        System.out.println("Enter longs: ");
        int longs = input.nextInt();
        array = new double[height][longs];
        for (int i=0;i<height;i++) {
            for (int j=0;j<longs;j++) {
                System.out.print("Enter element array[" + i + "][" + j + "]: " );
                array[i][j] = input.nextDouble();
            }
        }
        for (int i=0;i<height;i++) {
            for (int j=0;j<longs;j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        do {
            System.out.println("Which column do you want to sum? ");
            location = input.nextInt();
            if (location == -1) {
                System.exit(0);
            }
            for (int i=0;i<height;i++) {
                sum+=array[i][location];
            }
            System.out.println("Sum array: " + sum);
        }while (location!=-1);
    }
}
