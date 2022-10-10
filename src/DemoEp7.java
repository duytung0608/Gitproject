import ss12_map_and_tree.practice12.distinguish_hashmap_and_hashset.Student;

import java.util.HashSet;
import java.util.Set;

public class DemoEp7 {
    public static void main(String[] args) {
        Set<Student> products = new HashSet<>();
        Student p1 = new Student("1", 4, "laptop");
        Student p2 = new Student("1", 5, "smartphone");
        Student p3 = new Student("2", 6, "laptop");
        Student p4 = new Student("3", 6, "laptop");
        Student p5 = new Student("4", 4, "laptop");
        products.add(p1);
        products.add(p2);
        products.add(p3);
        products.add(p4);
        products.add(p5);

        products.forEach(System.out::println);


    }
}
