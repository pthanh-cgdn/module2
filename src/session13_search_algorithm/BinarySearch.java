package session13_search_algorithm;

import java.util.Arrays;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1; /* Now high < low, key not found */
    }

    static int binarySearchByRecursion(int[] list,int left, int right, int key) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key == list[mid]) {
                return mid;
            } else if (key > list[mid]) {
                left = mid + 1;
                binarySearchByRecursion(list, left, right, key);
            } else {
                right = mid - 1;
                binarySearchByRecursion(list, left, right, key);
            }
        }
        return -1;
    }
        public static void main (String[]args){
//            System.out.println(binarySearch(list, 2));  /* 0 */
//            System.out.println(binarySearch(list, 11)); /* 4 */
//            System.out.println(binarySearch(list, 79)); /*12 */
//            System.out.println(binarySearch(list, 1));  /*-1 */
//            System.out.println(binarySearch(list, 5));  /*-1 */
//            System.out.println(binarySearch(list, 80)); /*-1 */
//            Arrays.sort(list);
            System.out.println(binarySearchByRecursion(list, 0, list.length - 1, 7));
        }
    }
