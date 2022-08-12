package ss10_list.my_list;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    E[] elements = (E[]) new Object[DEFAULT_CAPACITY];

    public MyList() {
    }

    public MyList(int capacity) {
        E[] elements = (E[]) new Object[capacity];
    }

    public void add(int index, E element) {
        ensureCapacity();
        if (index<0 || index > size) {
            throw new IndexOutOfBoundsException
                    ("index:" + index + "out of bounds");
        } else {
            for (int i=size-1;i>=index;i--) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        }
    }

    public void ensureCapacity() {
        if (size >= elements.length) {
            E[] newData = (E[])(new Object[size * 2 + 1]);
            System.arraycopy(elements,0, newData, 0, size);
            elements = newData;
        }
    }

    public E remove(int index) {
        if (index<0 || index>=size) {
            throw new IndexOutOfBoundsException
                    ("index: " + index + "out of bounds");
        }
        E element = elements[index];
        for (int i = index;i<size-1;i++) {
            elements[i] = elements[i+1];
        }
        elements[--size] = null;
        return element;
    }

    public int size() {
        return size;
    }

    public E[] clone() {
        E[] newArrays = Arrays.copyOf(elements, elements.length);
//        for (int i=0;i<size;i++) {
//            newArrays[i] = elements[i];
//        }
        return newArrays;
    }

    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(E o) {
        if (o == null) {
            for (int i=0;i<size;i++) {
                if (elements[i] == o) {
                    return i;
                }
            }
        }
        else{
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean add(E e) {
        ensureCapacity();
        elements[size++] = e;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        if (elements.length < minCapacity) {
            elements = Arrays.copyOf(elements, minCapacity);
        }
    }

    public E get(int index) {
        if (index<0 || index>=size) {
            throw new IndexOutOfBoundsException
                    ("index: " + index + " out of bounds");
        }
        return elements[index];
    }

    public void clear() {
        elements = (E[]) (new Object[DEFAULT_CAPACITY]);
        size = 0;
    }

}
