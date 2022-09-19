package ss1_introdution_to_java.exercise1;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = input.nextLine();
        System.out.println("Hello: " + name);

    }
}
