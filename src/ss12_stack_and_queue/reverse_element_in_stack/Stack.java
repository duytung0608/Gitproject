package ss12_stack_and_queue.reverse_element_in_stack;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> {
    LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(T element) {
        stack.addFirst(element);
    }

    public T pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }

    public void pushString(String in,Stack stack) {
        int size = in.length();
        for (int i=0; i<size;i++) {
            char ch = in.charAt(i);
            stack.push(ch);
        }
    }
}
