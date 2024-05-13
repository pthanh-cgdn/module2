package session2_loop_array;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int count = 0;
        int number = 1;
        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number+" ");
                count ++;
            }
            number++;
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
