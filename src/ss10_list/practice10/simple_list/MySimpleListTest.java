package ss10_list.practice10.simple_list;

import ss10_list.practice10.simple_list.MySimpleList;

public class MySimpleListTest {
    public static void main(String[] args) {
        MySimpleList<Integer> listInteger = new MySimpleList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: " + listInteger.get(4));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2 " + listInteger.get(2));

//        listInteger.get(6);
//        System.out.println("element 6: " + listInteger.get(6));
//        listInteger.get(-1);
//        System.out.println("element -1: " + listInteger.get(-1));
    }
}
