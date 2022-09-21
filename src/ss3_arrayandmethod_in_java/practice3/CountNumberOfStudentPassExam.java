package ss3_arrayandmethod_in_java.practice3;

import java.util.Scanner;

public class CountNumberOfStudentPassExam {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        boolean SIZE;
        do {
            System.out.println("Enter Size: ");
            size = Integer.parseInt(input.nextLine());
            SIZE = size > 30;
            if (SIZE) {
                System.out.println("Size should not exeed 30");
            }
        } while(SIZE);
        array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter a mark for student " + (i+1) + ": ");
            array[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i  < size; i++) {
            if(array[i] >= 5 && array[i] <= 10)
                count++;
        }
        System.out.println("\n The number of the students passing the exams is " + count);
    }
}
