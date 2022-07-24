package ss2_loop_in_java;

import java.util.Scanner;

public class ShowFirst20Primes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        int numbers = input.nextInt();
        int count = 0;
        boolean check = true;
        for (int N=2;count<numbers;N++) {
            for(int i=2;i<=Math.sqrt(N);i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(N+"\t");
                count++;
            } else {
                check = true;
            }
        }

    }
}
