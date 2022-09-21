package ss1_introdution_to_java.practice01;

import java.util.Scanner;

public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập năm bạn muốn kiểm tra!! ");
        int year = Integer.parseInt(scanner.nextLine());
        if (year%4==0) {
            if (year%100==0) {
                if (year % 400 == 0) {
                    System.out.printf("Năm %d là năm nhuận!!",year);
                } else {
                    System.out.printf("Năm %d không phải là năm nhuận!!",year);
                }
            } else {
                System.out.printf("Năm %d là năm nhuận!!",year);
            }
        } else {
            System.out.printf("Năm %d không phải là năm nhuận!!",year);
        }
    }
}
