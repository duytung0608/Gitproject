package ss10_list.exercise10.my_list;

import java.util.Arrays;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(0,1);
        list.add(1,3);
        list.add(2,4);
        list.add(3,7);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(9);
//        list.add(10);

        //list.add(4,6);
        System.out.println(list.get(3) + "\n");
        System.out.println(Arrays.toString(list.elements));
        Object[] newlist = list.clone();
        System.out.println(Arrays.toString(newlist));




    }
}
