package ss13_search_algorithm;

import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str1 = input.nextLine();
        String str2 = str1.charAt(0)+"";
        for (int i=0;i<str1.length()-1;i++) {
            if(str1.charAt(i)<str1.charAt(i+1)) {
                str2+=str1.charAt(i+1);
            }
        }
        System.out.println(str2);
    }
}
