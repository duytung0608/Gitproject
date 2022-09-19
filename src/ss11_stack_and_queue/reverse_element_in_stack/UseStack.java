package ss11_stack_and_queue.reverse_element_in_stack;

import java.util.Scanner;

public class UseStack {
   private static void IntegerStack() {
       Stack<Integer> stack = new Stack<>();
       Stack<Integer> auxiliaryVariable = new Stack<>();
       stack.push(5);
       stack.push(4);
       stack.push(3);
       stack.push(2);
       stack.push(1);
       System.out.println("elements of stack after pop: ");
       while (!stack.isEmpty()) {
           int avari = stack.pop();
           System.out.printf(" %d", avari);
           auxiliaryVariable.push(avari);
       }
       System.out.println("\n\nelement after reverse and re-pop: ");
       while (!auxiliaryVariable.isEmpty()) {
           System.out.printf(" %d",auxiliaryVariable.pop());
       }
   }

   private static void StringOfStack() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter input: ");
       String input = scanner.nextLine();
       Stack<Character> stack = new Stack<>();
       stack.pushString(input,stack);
       String outp = "";
       while (!stack.isEmpty()) {
           outp = outp + stack.pop();
       }
       System.out.println(outp);
   }


    public static void main(String[] args) {
//        IntegerStack();
        StringOfStack();
    }
}
// hỏi về ---auto-boxing--- vì sao int lại chứ được pop() trong khi nó mang kiểu INTEGER(class)
