package ss10_list.my_list;

import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList();
        myList.add(0,1);
        myList.add(1,2);
        myList.add(2,3);
        myList.add(3,4);
        myList.add(4,5);
        myList.add(5,6);
        System.out.print("elements: ");
        for (int i=0;i<myList.size;i++) {
            System.out.print(myList.get(i) + " ");
        }
    }
}
