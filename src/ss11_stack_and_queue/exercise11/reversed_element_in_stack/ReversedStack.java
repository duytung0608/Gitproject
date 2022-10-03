package ss11_stack_and_queue.exercise11.reversed_element_in_stack;

import java.util.Arrays;

public class ReversedStack<T> {
    private Node<T> head;
    private Node<T> tail;
    private int numNodes = 0;

    public ReversedStack() {
        this.head = null;
        this.tail = null;
    }

    class Node<T> {
        public T key;
        public Node next;

        public Node(T key) {
            this.key = key;
            this.next = null;
        }
    }

    public void push(T e) {
        if (head == null) {
            head = tail = new Node<>(e);
        } else {
            Node temp = head;
            head = new Node<>(e);
            head.next = temp;
        }
        numNodes++;
    }

    public T pop() {
        if (this.tail == null) {
            throw new IndexOutOfBoundsException();
        }
        Node temp = head;
        head = head.next;
        numNodes--;
        return (T) temp.key;
    }

    public boolean isEmpty() {
        if(numNodes == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        ReversedStack<Integer> stack = new ReversedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while(!stack.isEmpty()) {
            System.out.print("Pop elements is : " + stack.pop());
        }

        System.out.println("\n\n\n");
        reversedStackOfInteger();
        reversedStackOfString();
    }

    private static void reversedStackOfInteger() {
        int[] arrays = {1, 2, 3, 4, 5, 6};
        ReversedStack<Integer> stack = new ReversedStack<>();
        for (int i=0; i<arrays.length; i++) {
            stack.push(arrays[i]);
        }
        for (int i=0; !stack.isEmpty(); i++) {
            arrays[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arrays));
    }

    private static void reversedStackOfString() {
        String name = "gnuTyuD";
        ReversedStack<Character> stack = new ReversedStack<>();
        for (int i=0; i<name.length(); i++) {
            stack.push(name.charAt(i));
        }
        System.out.println("String after reversed is : ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());

        }
    }

}
