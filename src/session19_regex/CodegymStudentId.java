package session19_regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodegymStudentId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter student ID: ");
        String studentId = scanner.nextLine();
        Pattern pattern = Pattern.compile("[CAP]\\d{4}[GHIK]\\d");
        Matcher matcher = pattern.matcher(studentId);
        while(!matcher.matches()){
            System.out.println("Please input right formated student id");
            studentId = scanner.nextLine();
            matcher = pattern.matcher(studentId);
        }
        System.out.println("Student ID: " + studentId);
    }
}
