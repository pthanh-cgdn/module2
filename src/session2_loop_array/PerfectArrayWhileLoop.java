package session2_loop_array;

public class PerfectArrayWhileLoop {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        int sumBefore = 0, sumAfter = 0;
        int i = 1, j = 0;
        while (i < arr.length - 1) {
            sumBefore = 0;
            sumAfter = 0;
            j = 0;
            while (j < arr.length) {
                if (j < i) {
                    sumBefore += arr[j];
                } else if (j > i) {
                    sumAfter += arr[j];
                }
                j++;
            }
            if (sumBefore == sumAfter) {
                System.out.println("Array is beautiful");
                break;
            }
            i++;
        }
        if (sumBefore != sumAfter) {
            System.out.println("Array is not beautiful");
        }
    }
}
