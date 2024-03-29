package ss11_stack_and_queue.practice11.stack_use_linkedlist;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private LinkedList<T> stack;

    public MyGenericStack() {
        stack = new LinkedList();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return stack.removeFirst();
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
