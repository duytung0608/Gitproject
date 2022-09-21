package ss1_introdution_to_java.practice01;

import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height,weight,bmi;
        System.out.println("Your Weight (in kilogram): ");
        weight = Double.parseDouble(scanner.nextLine());
        System.out.println("Your Height (in meter): ");
        height = Double.parseDouble(scanner.nextLine());
        bmi = weight / (height*height);
        if (bmi < 18.5) {
            System.out.printf("Chỉ số bmi là %f thuộc %s", bmi, "Underweight");
        } else if (bmi < 25) {
            System.out.printf("Chỉ số bmi là %f thuộc %s", bmi, "Normal");
        } else if (bmi < 30) {
            System.out.printf("Chỉ số bmi là %f thuộc %s", bmi, "Overweight");
        } else {
            System.out.printf("Chỉ số bmi là %f thuộc %s", bmi, "Obese");
        }
    }
}
// Xem lại bài th chỉ khác cái %-20.2f%s