package session2_loop_array;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        int money;
        int month;
        double interest;
        double returnAmount;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter money: ");
        money = input.nextInt();
        System.out.print("Enter month: ");
        month = input.nextInt();
        System.out.print("Enter interest: ");
        interest = input.nextDouble();
        returnAmount = money * (1 + interest) * (interest/100/12);
        System.out.println("Your return on investment is: " + returnAmount);
    }
}
