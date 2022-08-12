package ss10_list.my_linkedlist;


public class MyLinkedList<E> {
    Node head;
    int numNodes = 0;

    public MyLinkedList(Object data) {
        Node head = new Node(data);
    }

    public class Node<E> {
        Node next;
        Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E element) {
        if (index == 0) {
            addFirst(element);
        } else if (index >= numNodes) {
            addLast(element);
        } else {
            Node holder = head;
            for (int i=1;i<index;i++) {
                holder = holder.next;
            }
            Node temp = holder.next;
            holder.next = new Node(element);
            (holder.next).next = temp;
            numNodes++;
        }
    }

    public void addFirst(E element) {
        Node newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;

        if (head.next == null) {
            head.next = head;
        }
        numNodes++;
    }

    public void addLast(E element) {
        Node newNode = new Node<>(element);

        if (head.next == null) {
            head.next = head = newNode;
        } else {
            Node holder = head;
            for (int i=1;i<=numNodes-1;i++) {
                holder = holder.next;
            }
            Node temp = head;
            holder.next = new Node<>(element);
            (holder.next).next = temp;
        }
        numNodes++;
    }
//    public E remove() {
//
//    }
}
