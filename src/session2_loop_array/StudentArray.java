package session2_loop_array;
import java.util.Scanner;
public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        boolean isExist = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = input.nextLine();
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                isExist = true;
                System.out.println("Position of the students in the list " + name + " is: " + i);
                break;
            }
        }
        if (!isExist) {
            System.out.println("Student not found");
        }
    }
}
