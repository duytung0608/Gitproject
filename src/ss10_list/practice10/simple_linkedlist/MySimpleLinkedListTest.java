package ss10_list.practice10.simple_linkedlist;

public class MySimpleLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MySimpleLinkedlist linkedlist = new MySimpleLinkedlist(10);
        linkedlist.addFirst(11);
        linkedlist.addFirst(12);
        linkedlist.addFirst(13);

        linkedlist.add(4,9);
        linkedlist.add(4,9);
        linkedlist.printList();
    }
}
