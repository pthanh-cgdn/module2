package session14_sorting_algorithm;
public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[] list) {
        int minIndex;
        for(int i = 0; i < list.length; i++) {
            minIndex = i;
            for (int j = i; j < list.length; j++) {
                if (list[j] < list[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = list[i];
            list[i] = list[minIndex];
            list[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
