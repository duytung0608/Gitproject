package ss1_introdution_to_java;

import java.util.Scanner;

public class BtDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your Name: ");
        String name = scanner.nextLine();
        System.out.println("Hello: " + name);
    }
}
