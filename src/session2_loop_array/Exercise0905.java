package session2_loop_array;
import java.util.Scanner;
public class Exercise0905 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        double sum = 0;
        int n = input.nextInt();
        for (double i = 1; i <= n; i++) {
            sum += 1/i;
        }
        System.out.println("Result is: "+ sum);
    }
}
