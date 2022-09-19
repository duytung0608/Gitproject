package ss11_stack_and_queue.count_occurrences_of_each_word;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<String, Integer> treemap = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String string = scanner.nextLine();
        string = string.toLowerCase();
        String[] strs = string.split(" ");
        for (String str : strs) {
            if (treemap.containsKey(str)) {
                treemap.put(str,treemap.get(str) + 1);
            } else {
                treemap.put(str, 1);
            }
        }
        System.out.println(treemap + "\n");
    }
}
