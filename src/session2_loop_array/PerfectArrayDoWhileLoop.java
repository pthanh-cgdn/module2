package session2_loop_array;

public class PerfectArrayDoWhileLoop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sumBefore, sumAfter;
        int i =1, j=0;
        do {
            sumBefore = 0;
            sumAfter = 0;
            j=0;
            do {
                if (j < i) {
                    sumBefore += arr[j];
                } else if (j > i) {
                    sumAfter += arr[j];
                }
                j++;
            } while (j < arr.length);
            if (sumBefore == sumAfter) {
                System.out.println("Array is beautiful");
                break;
            }
            i++;
        } while (i < arr.length - 1);
        if (sumBefore != sumAfter) {
            System.out.println("Array is not beautiful");
        }
    }
}
