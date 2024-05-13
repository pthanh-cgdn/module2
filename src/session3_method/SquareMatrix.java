package session3_method;

import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Please input element [" + i + "][" + j + "]");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("The result is: "+sumDiagonal(arr));
    }
    public static int sumDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        return sum;
    }
}
