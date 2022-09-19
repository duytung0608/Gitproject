package ss3_arrayandmethod_in_java.exercise3;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        int[] array2;
        int[] array3;
        int count = 0;
        System.out.println("Enter size");
        int size = input.nextInt();
        array = new int[size];
        array2 = new int[size];
        array3 = new int[(size*2)];
        for (int l=0;l<size;l++) {
            System.out.print("Enter array's element " + (l+1) + ": ");
            array[l] = input.nextInt();
        }
        for (int m=0;m<size;m++) {
            System.out.print("Enter array2's element " + (m+1) + ": ");
            array2[m] = input.nextInt();
        }
        for (int i=0;i<size;i++) {
            array3[i] = array[i];
        }
        for (int j=size;j<size*2;j++) {
            array3[j] = array2[count];
            count++;
        }
        System.out.printf("%-20s%s", "Element in array3: ", "");
        for (int k=0;k<size*2;k++) {
            System.out.print(array3[k] + "\t");
        }
    }
}
