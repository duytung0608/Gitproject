package ss1_introdution_to_java;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bạn muốn đọc: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number>0  && number<10) {
            switch (number) {
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        } else if(number<20) {
            int unit = number % 10;
            switch (unit) {
                case 0:
                    System.out.println("Ten");
                    break;
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fiveteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eightteen");
                    break;
                case 9:
                    System.out.println("Nineteen");
                    break;
            }
        } else if (number<100) {
            int tens = number / 10;
            int ones = number % 10;
            String read="";
            switch (tens) {
                case 2:
                    read+="Twenty ";
                    break;
                case 3:
                    read+="Thirty ";
                    break;
                case 4:
                    read+="Forty ";
                    break;
                case 5:
                    read+="Fifty ";
                    break;
                case 6:
                    read+="sixty ";
                    break;
                case 7:
                    read+="Seventy ";
                    break;
                case 8:
                    read+="Eighty ";
                    break;
                case 9:
                    read+="Ninety ";
                    break;
            }
            switch (ones) {
                case 0:
                    read+="";
                    break;
                case 1:
                    read+="one";
                case 2:
                    read+="two";
                    break;
                case 3:
                    read+="three";
                    break;
                case 4:
                    read+="four";
                    break;
                case 5:
                    read+="five";
                    break;
                case 6:
                    read+="six";
                    break;
                case 7:
                    read+="seven";
                    break;
                case 8:
                    read+="eight";
                    break;
                case 9:
                    read+="nine";
                    break;
            }
            System.out.println(read);
        } else {
            int hundred = number / 100;
            int tens2 = number % 100;
            String read2="";
            switch (hundred) {
                case 1:
                    read2+="One hundred ";
                    break;
                case 2:
                    read2+="Two hundred ";
                    break;
                case 3:
                    read2+="Three hundred ";
                    break;
                case 4:
                    read2+="Four hundred ";
                    break;
                case 5:
                    read2+="Five hundred ";
                    break;
                case 6:
                    read2+="six hundred ";
                    break;
                case 7:
                    read2+="Seven hundred ";
                    break;
                case 8:
                    read2+="Eight hundred ";
                    break;
                case 9:
                    read2+="Nine hundred ";
                    break;
            }
            if (tens2>=0  && tens2<10) {
                switch (tens2) {
                    case 0:
                        read2+="";
                        break;
                    case 1:
                        read2+="and one";
                        break;
                    case 2:
                        read2+="and two";
                        break;
                    case 3:
                        read2+="and three";
                        break;
                    case 4:
                        read2+="and four";
                        break;
                    case 5:
                        read2+="and five";
                        break;
                    case 6:
                        read2+="and six";
                        break;
                    case 7:
                        read2+="and seven";
                        break;
                    case 8:
                        read2+="and eight";
                        break;
                    case 9:
                        read2+="and nine";
                        break;
                }
            } else if(tens2<20) {
                int unit2 = tens2 % 10;
                switch (unit2) {
                    case 0:
                        read2+="and ten";
                        break;
                    case 1:
                        read2+="and eleven";
                        break;
                    case 2:
                        read2+="and twelve";
                        break;
                    case 3:
                        read2+="and thirteen";
                        break;
                    case 4:
                        read2+="and fourteen";
                        break;
                    case 5:
                        read2+="and fifteen";
                        break;
                    case 6:
                        read2+="and sixteen";
                        break;
                    case 7:
                        read2+="and seventeen";
                        break;
                    case 8:
                        read2+="and eightteen";
                        break;
                    case 9:
                        read2+="and nineteen";
                        break;
                }
            } else if (tens2<100) {
                int tens3 = tens2 / 10;
                int ones3 = tens2 % 10;
                String read = "";
                switch (tens3) {
                    case 2:
                        read2 += "Twenty ";
                        break;
                    case 3:
                        read2 += "Thirty ";
                        break;
                    case 4:
                        read2 += "Forty ";
                        break;
                    case 5:
                        read2 += "Fifty ";
                        break;
                    case 6:
                        read2 += "sixty ";
                        break;
                    case 7:
                        read2 += "Seventy ";
                        break;
                    case 8:
                        read2 += "Eighty ";
                        break;
                    case 9:
                        read2 += "Ninety ";
                        break;
                }
                switch (ones3) {
                    case 0:
                        read2 += "";
                        break;
                    case 1:
                        read2 += "one";
                    case 2:
                        read2 += "two";
                        break;
                    case 3:
                        read2 += "three";
                        break;
                    case 4:
                        read2 += "four";
                        break;
                    case 5:
                        read2 += "five";
                        break;
                    case 6:
                        read2 += "six";
                        break;
                    case 7:
                        read2 += "seven";
                        break;
                    case 8:
                        read2 += "eight";
                        break;
                    case 9:
                        read2 += "nine";
                        break;
                }
            }
            System.out.println(read2);
        }
    }
}
