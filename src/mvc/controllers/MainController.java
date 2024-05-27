package mvc.controllers;

import mvc.models.Student;
import mvc.services.IStudentService;
import mvc.services.impl.StudentService;
import mvc.views.StudentView;

public class MainController {
    public static void main(String[] args) {
        StudentView studentView = new StudentView();
        StudentService studentService = new StudentService();
        int choice;
        int code;
        boolean confirm = false;
        Student student;
        boolean result;
        while (true) {
            choice = studentView.view();
            switch (choice) {
                case 1: {
                    student = studentView.viewAdd();
                    result = studentService.add(student);
                    studentView.viewMessage(result);
                    break;
                }
                case 2: {
                    code = studentView.viewEdit();
                    student = studentService.checkStudent(code);
                    if(student != null){
                        confirm = studentView.confirmEdit(student);
                    } else {
                        studentView.viewMessageNotFould(code);
                    };
                    if(confirm){
                        student = studentView.viewEdit(student);
                        studentService.delete(studentService.checkStudent(code));
                        result = studentService.add(student);
                        if(!result){
                            studentService.add(studentService.checkStudent(code));
                        }
                        studentView.viewMessage(result);
                    }
                    break;
                }
                case 3: {
                    code = studentView.viewDelete();
                    student = studentService.checkStudent(code);
                    if(student != null){
                        confirm = studentView.confirmDelelte(student);
                    } else {
                        studentView.viewMessageNotFould(code);
                    };
                    if (confirm){
                        studentService.delete(student);
                        studentView.viewMessage(true);
                    }
                    break;
                }
                case 4: {
                    String str = studentService.displayAll();
                    studentView.showMessage(str);
                    break;
                }
                case 0:
                    return;
            }
        }
    }
}
