package ss3_arrayandmethod_in_java.practice3;

import java.util.Scanner;

public class FindMinimumValueInArray {
    public static void main(String[] args) {
        int[] arr;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = input.nextInt();
        arr = new int[size];
        for (int i=0;i<size;i++) {
            System.out.println("Enter the element " + (i+1) + ": ");
            arr[i] = input.nextInt();
        }
        int index = miniValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int miniValue(int[] array) {
        int index = 0;
        for (int i=1;i<array.length;i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
