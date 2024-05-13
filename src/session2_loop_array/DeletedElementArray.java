package session2_loop_array;

import java.util.Scanner;

public class DeletedElementArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,1,2,3,47};
        System.out.println("Enter the deleting number of the array: ");
        int n = input.nextInt();
        int[] newArray = deleteElement(array,n);
        for (int i = 0; i < array.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
    public static int[] deleteElement(int[] arr, int target) {
        boolean[] index = new boolean[arr.length];
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index[i] = true;
            }
        };
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!index[i]) {
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
}
