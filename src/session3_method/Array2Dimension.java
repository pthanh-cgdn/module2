package session3_method;

import java.util.Scanner;

public class Array2Dimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Please input element [" + i + "][" + j + "]");
                arr[i][j] = input.nextInt();
            }
        }
        int cols;
        do {
            System.out.println("Please input cols");
            cols = input.nextInt();
        } while (cols >= arr.length || cols < 0);
        System.out.println("The result is: "+sumCols(arr,cols));

    }
    public static int sumCols(int[][] arr, int cols) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][cols];
        }
        return sum;
    }
}
