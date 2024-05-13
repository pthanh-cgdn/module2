package session4_oop;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation() {

    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void solve() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Quadratic equation has infinity result");
                } else {
                    System.out.println("Quadratic equation has no result");
                }
            } else {
                System.out.println("Quadratic equation has one result" + c / b);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Quadratic equation has no result");
            } else if (delta == 0) {
                System.out.println("Quadratic equation has one result " + b / a / 2);
            } else {
                System.out.println("Quadratic equation has two result");
                System.out.println("First result is: " + (b - delta) / a / 2);
                System.out.println("Second result is: " + (b + delta) / a / 2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = input.nextDouble();
        System.out.println("Enter the second number");
        double b = input.nextDouble();
        System.out.println("Enter the third number");
        double c = input.nextDouble();
        QuadraticEquation solution = new QuadraticEquation(a, b, c);
        solution.solve();
    }
}
