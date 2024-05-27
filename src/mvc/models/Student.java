package mvc.models;

import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Student extends Person {
    private String classroom;

    public Student() {
    }

    public Student(int code, String name, String address, String classroom) {
        super(code, name, address);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
