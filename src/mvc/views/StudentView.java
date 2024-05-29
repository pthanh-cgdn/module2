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
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        do{
        try {
            System.out.println("Input your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number");
        }
        } while (choice <0 || choice > 5);
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

    public int viewEdit() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input student's code you want to edit: ");
        int code = Integer.parseInt(scanner.nextLine());
        return code;
    }

    public Student viewEdit(Student student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Edit code: current code = "+student.getCode()+" :");
        int code = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name: current name = "+student.getName()+" :");
        String name = scanner.nextLine();
        System.out.println("Input address: current address = "+student.getAddress()+" :");
        String address = scanner.nextLine();
        System.out.print("Input classroom: current classroom = "+student.getClassroom()+" :");
        String classroom = scanner.nextLine();
        return new Student(code, name, address, classroom);
    }

    public boolean confirmEdit(Student student) {
        System.out.println("Do you want to edit information of student, code: "+student.getCode()+", name: "+student.getName()+" ?");
        System.out.println("Input Y to confirm");
        System.out.println("Input N to cancel");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        return choice.equals("Y");
    }
}
