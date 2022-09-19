package ss1_introdution_to_java.practice1;

import java.util.Scanner;

public class CalculateTheNumberOfDaysInTheMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which month that you want to count days? ");
        int month = Integer.parseInt(input.nextLine());
        String daysInMonth = "";
        switch (month) {
            case 2: {
                System.out.println("Enter now Year: ");
                int year = input.nextInt();
                if (year % 4 == 0) {
                    if(year % 100 == 0) {
                        if (year % 400 == 0) {
                            daysInMonth = "29";
                        } else {
                            daysInMonth = "28";
                        }
                    } else {
                        daysInMonth = "29";
                    }
                } else {
                    daysInMonth = "28";
                }
                break;
            }
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            default: {
                if (month < 12) {
                    daysInMonth = "30";
                }else daysInMonth = "";
            }
        }
        if (!daysInMonth.equals("")) System.out.printf("The month '%d' has %s days!",month,daysInMonth);
        else System.out.println("Invalid input!");
    }
}
