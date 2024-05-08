package session1_java_introduction;

import java.util.Scanner;
public class LeaveYearCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = input.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year +" is a leave year");
        } else {
            System.out.println(year + " is not a leave year " + year);
        }
    }
}
