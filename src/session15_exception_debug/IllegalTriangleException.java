package session15_exception_debug;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    public static void createTriangle() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first sides of triangle: ");
        int side1 = input.nextInt();
        System.out.print("Enter second sides of triangle: ");
        int side2 = input.nextInt();
        System.out.print("Enter third sides of triangle: ");
        int side3 = input.nextInt();
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new InputMismatchException();
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new Exception();
        }
    }

    public static void main(String[] args) {
        try {
            createTriangle();
            System.out.println("Your triangle is valid");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input value");
        } catch (Exception e) {
            System.out.println("Invalid triangle");
        }
        System.out.println("End program");
    }
}
