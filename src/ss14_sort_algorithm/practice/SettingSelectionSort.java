package ss14_sort_algorithm.practice;

public class SettingSelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    // codes below here

    public static void selectionSort(double[] list) {
        for (int i=0; i < list.length-1; i++) {
            double min = list[i];
            int minindex = i;
            for (int j = i+1; j < list.length;j++) {
                if (min > list[j]) {
                    min = list[j];
                    minindex = j;
                }
            }
            if (minindex != i) {
                list[minindex] = list[i];
                list[i] = min;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i=0; i < list.length; i++) {
            System.out.println(list[i] + " ");
        }
    }
}
