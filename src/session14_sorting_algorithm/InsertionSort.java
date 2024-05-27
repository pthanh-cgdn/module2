package session14_sorting_algorithm;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        int temp;
        for (int i = 1; i < list.length; i++) {
            temp = list[i];
            for (int j = i-1; j >= 0; j--) {
                if (list[j] > temp) {
                    list[j+1] = list[j];
                    list[j] = temp;
                } else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] list = { 4, 5, 9, 7, 8, -1 };
        insertionSort(list);
        for (int value : list) {
            System.out.print(value + " ");
        }
    }
}
