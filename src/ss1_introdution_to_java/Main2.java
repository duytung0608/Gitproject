package ss1_introdution_to_java;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        double width;
        String height;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner
        System.out.println("Enter Width: ");
        width = Double.parseDouble(scanner.nextLine());//Nhập chiều rộng
        System.out.println("Enter height: ");
        height = scanner.nextLine();//Nhập chiều dài
        //float area = width + height;

        System.out.println("height is: " + height);
        System.out.println("width is: " + width);
    }
}
