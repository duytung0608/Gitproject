package ss11_stack_and_queue.practice11.stack_use_linkedlist;

public class GenericStackClient {
    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");

        System.out.println("1.1 Size of stack afer push operaions: " + stack.size());
        System.out.println("1.2 Pop elements from stack : ");
        while (!stack.isEmty()) {
            System.out.printf(" %s", stack.pop());
        }

        System.out.println("\n1.3 Size of stack after pop operation : " + stack.size());
    }

    private static void stackOfInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stacks after push operations: " + stack.size());
        System.out.println("2.2 Pop elements from stack : ");
        while (!stack.isEmty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n2.3 Size of stack after pop operations : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of inegers");
        stackOfInteger();
        System.out.println("2. Stack of String");
        stackOfStrings();
    }


}

