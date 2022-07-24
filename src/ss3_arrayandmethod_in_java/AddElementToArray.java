package ss3_arrayandmethod_in_java;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 5, 7, 8, 1, 0, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        System.out.println("Enter index you want to insert: ");
        int index = input.nextInt();
        if (index<0 ||  index>array.length-1) {
            System.out.println("Can't insert");
        } else {
            for(int i=array.length-1;i>=index+1;i--) {
                array[i] = array[i-1];
            }
            array[index] = number;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int i=0;i< array.length;i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
