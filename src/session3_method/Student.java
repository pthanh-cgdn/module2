package session3_method;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of class: ");
        int size = input.nextInt();
        int[] score = new int[size];
        for (int i = 0; i < size; i++) {
            do {
                System.out.print("Enter the score of student " + i + " :");
                score[i] = input.nextInt();
            } while (score[i] > 10 || score[i] < 0);
        }
        System.out.print("List of score : ");
        for (int i = 0; i < size; i++) {
            if (score[i] >= 5) {
                System.out.print(score[i] + " ");
            }
        }
    }
}
