package ss10_list.practice10.simple_list;

import java.util.Arrays;

public class MySimpleList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPASITY = 10;
    private Object elements[];

    public MySimpleList() {
        elements = new Object[DEFAULT_CAPASITY];
    }

    private void ensucapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E e) {
        if (size == elements.length) {
            ensucapa();       // cách xử lí gọi hàm khi mà hàm được gọi bị private nên ko thể gọi sau khi khởi tạo đối tượng mà chỉ khởi tạo được trong class
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i<0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + size);
        }

        return (E) elements[i];
    }
}
