package session2_loop_array;

import java.util.Scanner;

public class FibonacyList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements : ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(getFibonacy(n)[i]);
        }
    }

    public static int[] getFibonacy(int n) {
        int[] fib = new int[n];
        if (n < 2) {
            fib[0] = 1;
            fib[n - 1] = 1;
        } else {
            fib[0] = 1;
            fib[1] = 1;
            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }
        return fib;
    }
}

