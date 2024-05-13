package session2_loop_array;
import java.util.Scanner;
public class FindMax {
    public static void main(String[] args) {

        int size;
        int[] arr;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter array's size");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("The array does not exceed 20");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Please input element " + i + ": ");
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum element is " + max);
    }
}
