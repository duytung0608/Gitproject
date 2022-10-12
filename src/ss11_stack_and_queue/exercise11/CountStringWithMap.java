package ss11_stack_and_queue.exercise11;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountStringWithMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String string = scanner.nextLine();
        Map<String, Integer> map = new TreeMap<>();
        string.toLowerCase();
        for (int i=0; i<string.length(); i++) {
            String charater = string.charAt(i)+"";
            if ( !map.containsKey(charater) ) {
                map.put(charater, 1);
            } else {
                map.put(charater, map.get(charater) + 1);
            }
        }
        System.out.println(map);
    }

}
