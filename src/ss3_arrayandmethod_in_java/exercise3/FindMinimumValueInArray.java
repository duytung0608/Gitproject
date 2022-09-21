package ss3_arrayandmethod_in_java.exercise3;

import java.util.Scanner;

public class FindMinimumValueInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = Integer.parseInt(input.nextLine());
        int[] arr = new int[size];
        for (int i=0;i<size;i++) {
            System.out.print("Enter the Element " + (i+1) + ": ");
            arr[i] = input.nextInt();
            System.out.println("\n");
        }
        int minValue = arr[0];
        for(int k = 1; k < size; k++) {
            if (minValue>arr[k]) {
                minValue = arr[k];
            }
        }
        System.out.println("minValue in array : " + minValue);
    }
}
