package ss11_stack_and_queue.implement_a_queue_using_a_circular_linked_list;

public class DemoQueue {
    public static void main(String[] args) {
        Solution<String> queue = new Solution();
        queue.enQueue("Da Nang");
        queue.enQueue("Ha Noi");
        queue.enQueue("Hue");
//        queue.deQueue();
        System.out.println("Element of stack: ");
        queue.displayQueue();

    }
}
