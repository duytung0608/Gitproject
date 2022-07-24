package ss3_arrayandmethod_in_java;

import java.util.Scanner;

public class FindTheLargestElementInATwoDimensionalArray {
    public static void main(String[] args) {
        double[][] array;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array by height: ");
        int height = input.nextInt();
        System.out.println("Enter size of array by longs: ");
        int longs = input.nextInt();
        array = new double[height][longs];
        for (int i=0;i<height;i++) {
            for (int j=0;j<longs;j++) {
                System.out.println("Element of index array["+i+"]["+j+"]: ");
                array[i][j] = input.nextDouble();
            }
        }
        double max = array[0][0];
        for (int i=0;i<height;i++) {
            for (int j=0;j<longs;j++) {
                if (max<array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("The largest element in the array is " + max);

    }
}
