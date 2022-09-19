package ss1_introdution_to_java.practice1;

import java.util.Date;
public class SystemTime {
    public static void main(String[] args) {
        Date now = new Date(); // lấy thời gian hiện tại, trả về theo dạng 'Mon Sep 19 18:04:51 ICT 2022'

        System.out.println("Now ís: " + now);
    }
}
