package ss2_loop_in_java;

import java.util.Scanner;

public class CalculateLoanInterest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        money = Double.parseDouble(input.nextLine());
        System.out.println("Enter number of months: ");
        month = Integer.parseInt(input.nextLine());
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = Double.parseDouble(input.nextLine());
        double totalInterest = 0;
        for (int i=0; i<month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
