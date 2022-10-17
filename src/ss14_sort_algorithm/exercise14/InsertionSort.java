package ss14_sort_algorithm.exercise14;

public class InsertionSort {
    static int[] list = {3, 4, -2, 7, 2, 5, -1, -6, 9};

    public static void insertionSort(int[] list) {
        int post, temp;
        for (int i=1; i<list.length; i++) {
            temp = list[i];
            post = i;

            while (post > 0 && temp < list[post-1]) {
                list[post] = list[post-1];
                post--;
            }

            list[post] = temp;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i=0; i<list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
