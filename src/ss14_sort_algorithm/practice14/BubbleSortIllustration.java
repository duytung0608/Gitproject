package ss14_sort_algorithm.practice14;

import java.util.Scanner;

public class BubbleSortIllustration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = Integer.parseInt(input.nextLine());
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0;i<list.length;i++) {
            list[i] = input.nextInt();
        }
        System.out.println("Your input list: ");
        for (int i=0; i<list.length; i++) {
            System.out.println(list[i] + "\t");
        }

        System.out.println("\n Begin sort processing....");
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;

        for (int k=1; k<list.length; k++) {
            needNextPass = false;
            for (int i=0; i<list.length - k; i++) {
                if (list[i] > list[i+1]) {
                    int temp = list[i];
                    list[i] = list[i+1];
                    list[i+1] = temp;

                    needNextPass = true;
                }
            }
            // Array may be sorted and next pass not needed
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the " + k + " sort: ");
            for (int j=0; j<list.length; j++) {
                System.out.println(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
