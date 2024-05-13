package session2_loop_array;

public class PerfectArrayForLoop {
    public static void main(String[] args) {
        int[] arr = {1, 5, 10, 2, 3, 1};
        int sumBefore = 0, sumAfter = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            sumBefore = 0;
            sumAfter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (j < i) {
                    sumBefore += arr[j];
                } else if (j > i) {
                    sumAfter += arr[j];
                }
            }
            if (sumBefore == sumAfter) {
                System.out.println("Array is beautiful");
                break;
            }
        }
        if (sumBefore != sumAfter) {
            System.out.println("Array is not beautiful");
        }
    }
}
