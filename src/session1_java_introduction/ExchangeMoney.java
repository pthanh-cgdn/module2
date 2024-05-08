package session1_java_introduction;

import java.util.Scanner;
public class ExchangeMoney {
    public static void main(String[] args) {
        final int exchangeRate = 25000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount USD you want to exchange: ");
        int amount = scanner.nextInt();
        int amountVnd = amount * exchangeRate;
        System.out.print("Your money in VND: " + amountVnd);
    }
}
