package ss10_list.exercise10.my_linked_list;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, E elements) {
        if(index == 0) {
            addFirst(elements);
        } else if (index >= numNodes) {
            addLast(elements);
        } else {
            Node temp = head;
            Node holder;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            holder = temp.next;
            temp.next = new Node(elements);
            temp.next.next = holder;
            numNodes++;
        }
    }

    public void addFirst(E e) {
        if (head == null) {
            head = new Node(e);
        } else {
            Node temp = head.next;
            head = new Node(e);
            head.next = temp;
        }
        numNodes++;
    }

    public void addLast(E e) {
        if (head == null) {
            head = new Node(e);
        } else {
            Node temp = head;
            for (int i=0; temp != null; i++) {
                temp = temp.next;
                if (temp == null) {
                    temp = new Node(e);
                }
            }
        }
        numNodes++;
    }

    public E remove(int index) {
        Node temp = head;
        if (index < 0 || index >= numNodes)
            throw new IndexOutOfBoundsException("NumNodes: " + numNodes + "Index: " + index);
        else if(index == 0) {
            if (numNodes == 0) {
                return null;
            }else {
                Node holder = head;
                head = head.next;
                return (E) holder.data;
            }
        } else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            Node holder = temp.next;
            temp.next = holder.next;
            numNodes--;
            return (E) holder.data;
        }
    }

    public boolean remove(Object e) {
        Node holder = head;
        for (int i = 0; i<numNodes; i++) {
            if (holder.data == e) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public E clone() {
        return (E) head.data;
    }

    public boolean constains(E o) {
        return true;
    }

    public int indexOf(E o) {
        return 1;
    }

    public E get(int index) {
        return (E) head.data;
    }

    public void clear() {
        
    }
}
