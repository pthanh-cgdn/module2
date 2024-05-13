package session2_loop_array;

import java.util.Scanner;

public class AddNewElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = {1,2,3,5};
        System.out.println("Enter the addind number of the array: ");
        int target = input.nextInt();
        System.out.println("Enter the position of new number");
        int index = input.nextInt();
        int[] newArray = addElement(array,target,index);
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
    }
    public static int[] addElement(int[] arr, int target, int index) {
       int[] newArr = new int[arr.length+1];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i != index) {
                newArr[i] = arr[j];
                j++;
            } else {
                newArr[i] = target;
            }
        }
        return newArr;
    }
}
