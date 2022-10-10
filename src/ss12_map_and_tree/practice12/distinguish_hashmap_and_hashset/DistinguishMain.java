package ss12_map_and_tree.practice12.distinguish_hashmap_and_hashset;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistinguishMain {
    public static void main(String[] args) {
        Student student1 = new Student("Nam",24,"HN");
        Student student2 = new Student("Nu",19,"Hue");
        Student student3 = new Student("Hung",20,"DN");

        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(1,student1);

        for(Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());      // truy xuất đến đâu ????????
        }

        System.out.print("\n\n");
        System.out.println("..............Set");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);


//        for(Student student : students) {
//            System.out.println(student.toString()); // phải luôn cân nhắc là kiểu khai báo và kiểu thực tế sẽ khác nha!!!
//        }

        students.forEach(System.out::println);
    }
}
