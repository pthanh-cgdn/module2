package session2_loop_array;

import java.util.Scanner;

public class GeometricDisplay {
    public static void main(String[] args) {
        byte choice = -1;
        byte heigt = 4;
        byte width = 10;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter an option: ");
            choice = input.nextByte();
            switch (choice) {
                case 1:
                    for (int i = 0; i < heigt ; i++){
                        for (int j = 0; j < width ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < heigt ; i++){
                        for (int j = heigt - i; j > 0 ; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 0; i <= heigt ; i++){
                        for (int j = width - i; j > 0 ; j--) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i*2+1 ; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option");

            }
        }
    }
}
