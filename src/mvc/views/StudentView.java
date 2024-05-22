package mvc.views;

import mvc.models.Student;

import java.util.Scanner;

public class StudentView {

    public int view() {
        System.out.println("--------Student View--------");
        System.out.println("1. Add student");
        System.out.println("2. Edit student");
        System.out.println("3. Delete student");
        System.out.println("4. Display all student");
        System.out.println("0. End program");
        System.out.println("Input your choice: ");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        return choice;

    }

    public Student viewAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input code: ");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.print("Input name: ");
        String name = scanner.nextLine();
        System.out.print("Input address: ");
        String address = scanner.nextLine();
        System.out.print("Input classroom: ");
        String classroom = scanner.nextLine();
        Student student = new Student(code, name, address, classroom);
        return student;
    }
    public int viewDelete(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input code of the student you want to delete: ");
        int code = Integer.parseInt(scanner.nextLine());
        return code;
    }

    public void viewMessage(boolean result) {
        if(result) {
            System.out.println("Your order is executed successfully!");
        } else {
            System.out.println("Your order is fail to executed!");
        }
    }

    public boolean confirmDelelte(Student student) {
        System.out.println("Do you want to delete the student, code: "+student.getCode()+", name: "+student.getName()+" ?");
        System.out.println("Input Y to confirm delete");
        System.out.println("Input N to cancel");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        return choice.equals("Y");
    }

    public void viewMessageNotFould(int code) {
        System.out.println("Student code "+ code+" is not found!");
    }

    public void showMessage(String str) {
        System.out.println(str);
    }
}
