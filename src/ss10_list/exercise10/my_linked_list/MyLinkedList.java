package ss10_list.exercise10.my_linked_list;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
        head = new Node()
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
