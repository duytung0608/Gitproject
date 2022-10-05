package ss11_stack_and_queue.exercise11.circular_linkedlist_queue;

public class CircularQueue<T> {
    private Node<T> head;
    private Node<T> tail;

    public CircularQueue() {
        this.head = null;
        this.tail = null;
    }

    class Node<T> {
        private T key;
        private Node next;

        public Node(T key) {
            this.key = key;
            this.next = null;
        }
    }

    public void enqueue(T e) {
        if (head == null) {
            head = tail = new Node(e);
        } else {
            Node temp = tail;
            tail = new Node<>(e);
            temp.next = tail;
            tail.next = head;
        }
    }

    public T dequeue() {
        if (head == null) {
            return null;
        }
        if (head == tail) {
            Node temp = head;
            head = tail = null;
            return (T) temp.key;
        }
        Node holder = head;
        head = head.next;
        tail.next = head;
        return (T) holder.key;
    }

    public void displayQueue() {
        while (head != null) {
            Node temp = head;
            if (head == tail) {
                head = tail = null;
                System.out.print(temp.key + "\t");
            } else {
                head = head.next;
                tail.next = head;
                System.out.print(temp.key + "\t");
            }
        }
    }

    public static void main(String[] args) {
        CircularQueue<Integer> queue = new CircularQueue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.dequeue();
//        queue.displayQueue();
        while (queue.head != null) {
            System.out.println(queue.dequeue() + "\t");
        }
    }
}
