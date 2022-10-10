package ss12_map_and_tree.practice12.sorting_with_comparable_and_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if(s1.getAge() > s2.getAge()) {
            return 1;
        } else if(s1.getAge() == s2.getAge()) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Student student = new Student("Kien", 24, "HT");
        Student student1 = new Student("Tung", 18, "Hue");
        Student student2 = new Student("Vi", 26, "NA");
        Student student3 = new Student("Thu", 29, "HN");
        Student student4 = new Student("Chau", 18, "Hue");

        ArrayList<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        lists.add(student4);
        Collections.sort(lists);
        for(Student st : lists) {
            System.out.println(st.toString());   // vì comparable nó đang dùng phương thức trong Student là so sánh theo name ( tức là string )
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student st : lists) {
            System.out.println(st.toString());  // so sánh theo tuổi vì getAge ở trong comparator !!!
        }
    }
}
