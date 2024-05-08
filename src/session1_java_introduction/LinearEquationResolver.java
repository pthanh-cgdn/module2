package session1_java_introduction;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given equation ax = b. Please input a");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Please input b");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinity solution");
            } else {
                System.out.println("The equation has no solution");
            }
        } else {
            double result = b / a;
            System.out.println("The equation has 1 solution: x = " + result);
        }
    }
}
