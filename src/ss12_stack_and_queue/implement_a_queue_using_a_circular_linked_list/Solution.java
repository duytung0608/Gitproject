package ss12_stack_and_queue.implement_a_queue_using_a_circular_linked_list;

public class Solution<T> {
    QueueUseLinkled<T> queue = new QueueUseLinkled<>();
    public Solution() {
    }

    public void enQueue(T in) {
        Node holder = new Node(in);
        if (queue.front == null) {
            queue.front = queue.rear = holder;
            queue.rear.link = queue.front;
        }
        queue.rear.link = holder;
        queue.rear = holder;
        queue.rear.link = queue.front;
    }

    public Node deQueue() {
        if (queue.front == null) {
            return null;
        }
        Node temp = queue.front;
        if (queue.front == queue.rear) {
            queue.front = queue.rear = null;
        } else {
            queue.front = queue.front.link;
            queue.rear.link = queue.front;
        }
        return temp;
    }
}
