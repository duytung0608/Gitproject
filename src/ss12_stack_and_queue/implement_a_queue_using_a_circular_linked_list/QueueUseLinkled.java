package ss12_stack_and_queue.implement_a_queue_using_a_circular_linked_list;

public class QueueUseLinkled<T> {
    public Node front;
    public Node rear;

    public QueueUseLinkled() {
        this.front = null;
        this.rear = null;
    }

    public void enQueue(T in) {
        Node holder = new Node(in);
        if (this.front == null) {
            this.front = this.rear = holder;
            this.rear.link = front;
        }
        this.rear.link = holder;
        this.rear = holder;
        this.rear.link = front;
    }

    public Node deQueue() {
        if (this.front == null) {
            return null;
        }
        Node temp = this.front;
        if (this.front == this.rear) {
            this.front = this.rear = null;
        } else {
            this.front = this.front.link;
            this.rear.link = this.front;
        }
        return temp;
    }

}
