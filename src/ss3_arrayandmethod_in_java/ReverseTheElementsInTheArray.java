package ss3_arrayandmethod_in_java;

import java.util.Scanner;

public class ReverseTheElementsInTheArray {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size =  Integer.parseInt(scanner.nextLine());
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i+1) + ": ");
            array[i] = Integer.parseInt(scanner.nextLine());
            i++;
        }
        System.out.printf("%-20s%s", "Element in array: ", ""); // cái -20s%s là cái gì zậy?
        for (int j=0;j<array.length;j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j=0;j<array.length/2;j++) {
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j=0;j<array.length;j++) {
            System.out.print(array[j] + "\t");
        }

    }
}
