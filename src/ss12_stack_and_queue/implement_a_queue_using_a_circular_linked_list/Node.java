package ss12_stack_and_queue.implement_a_queue_using_a_circular_linked_list;

public class Node<T> {
    public T data;
    public Node link;

    public Node(T data) {
        this.data = data;
        this.link = null;
    }
}
