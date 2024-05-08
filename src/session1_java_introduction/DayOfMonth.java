package session1_java_introduction;

import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        System.out.println("Enter the date you wish to calculate the day of the month");
        Scanner scanner = new Scanner(System.in);
        byte month = scanner.nextByte();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            case 2:
                System.out.println("This month has 28 or 29 days");
        }
    }
}
