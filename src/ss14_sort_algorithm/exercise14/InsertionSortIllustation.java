package ss14_sort_algorithm.exercise14;

import java.util.Scanner;

public class InsertionSortIllustation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = Integer.parseInt(input.nextLine());
        double[] list = new double[size];
        System.out.println("Enter " + list.length + "' values: ");
        for (int i=0; i<list.length; i++) {
            list[i] = input.nextDouble();
        }

        System.out.println("\nBegin Sort......");
        mergeSortByStep(list);

    }

    public static void mergeSortByStep(double[] list) {
        int pos;
        double temp;
        for (int i=1; i<list.length; i++) {
            temp = list[i];
            pos = i;

            while (pos > 0 && temp < list[pos - 1]) {
                list[pos] = list[pos-1];
                pos--;
            }

            list[pos] = temp;

            System.out.println("List after " + i + " sort: ");
            for (int k=0; k<list.length; k++) {
                System.out.println(list[k]);
            }
        }
    }
}
