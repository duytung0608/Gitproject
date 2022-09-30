package ss10_list.exercise10.my_list;

import java.util.Arrays;

public class MyList<E>{
    private int size = 0;
    private static final int DEFAULT_CAPASITY = 4;
    public Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPASITY];
    }

    public MyList(int capasity) {
        elements = new Object[capasity];
    }

    public void ensucapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (elements.length == size)
            ensucapa();
        for (int i=size-1; i>=index;i--) {
            elements[i++] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if(index>size || index<0) {
            throw new IndexOutOfBoundsException("Size: " + size + " Index: " + index);
        }
        E holder = (E) elements[index];
        for (int i=index; i<size-1;i++) {
            elements[i] = elements[i++];
        }
        return (E) holder;
    }

    public int size() {
        return size;
    }

    public Object[] clone() {
        Object[] newList = Arrays.copyOf(elements,size);
        for (int i=0; i<size; i++) {
            newList[i] = elements[i];
        }
        return newList;
    }

    public boolean constains(Object o) {
        return indexOf(o) >= 0;
    }

    public int indexOf(Object o) {
        if (o == null) {
            for (int i=0; i<size; i++) {
                if (elements[i] == null)
                    return i;
            }
        } else {
            for (int i=0; i<size; i++) {
                if(o.equals(elements[i]))
                    return i;
            }
        }
        return -1;
    }

    public boolean add(E o) {
        if(size == elements.length){
            return false;
        }
        elements[size] = o;
        size++;
        return true;
    }

    public E get(int index) {
        if (index>=size || index<0) {
            throw new IndexOutOfBoundsException("size: " + size + "index: " + index);
        }
        return (E) elements[index];
    }

    public void clear() {
        for (int i=0; i<size; i++) {
            elements[i] = null;
        }
    }


//    public static void main(String[] args) {
//        MyList list = new MyList();
//        System.out.println(list.elements);
//        System.out.println(list.clone());
//    }
}
