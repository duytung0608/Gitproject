package ss12_map_and_tree.practice12.get_acquainted_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Smith", 30);
        hashMap.put("Anderson", 32);
        hashMap.put("Lewh", 30);
        hashMap.put("Cook", 29);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n"); // gọi hashMap tức là gọi toString mà hashMap,treeMap,LinkedMap ko có toString nên là nó lấy của thg cha nó là AbstractMap

        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Duytung", 19);
        treeMap.put("binlaid", 19);
        treeMap.put("weisong", 17);
        treeMap.put("ruan", 21);
        treeMap.put("rua", 19);
        System.out.println("\n" + treeMap + "\n");
//        System.out.println(treeMap.toString());

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("DuyTung", 29);
        linkedHashMap.put("DuyTun", 27);
        linkedHashMap.put("DuyTug", 23);
        linkedHashMap.put("DuyTng", 31);
        System.out.println("\n" + linkedHashMap);
        System.out.println("The age of Duy Tung is : " + linkedHashMap.get("DuyTung"));


    }
}
