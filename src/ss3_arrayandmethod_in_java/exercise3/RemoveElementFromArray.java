package ss3_arrayandmethod_in_java.exercise3;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] array = {1, 3, 5 , 8, 23, 56, 2, 0, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        int index = -1;
        for (int i=0;i<array.length;i++) {
            if (number==array[i]) {
                index = i;
            }
        }
        if (index!=-1) {
            System.out.println(array[index]);
            for (int j=index;j<array.length-1;j++) {
                array[j] = array[j+1];
            }
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int k=0;k<array.length;k++) {
            System.out.print(array[k] + "\t");
        }

    }
}
