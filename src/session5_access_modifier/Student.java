package session5_access_modifier;

public class Student {
    private int rollno;
    private String name = "John";
    private static String classes = "C02";

    //constructor to initialize the variable
    Student(){
    }
    Student(int r, String n) {
        rollno = r;
        name = n;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    //static method to change the value of static variable
    static void change() {
        classes = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + classes);
    }

    public static void main(String args[]) {
        Student.change(); //calling change method

        //creating objects
        Student s1 = new Student(111, "Hoang");
        Student s2 = new Student(222, "Khanh");
        Student s3 = new Student(333, "Nam");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}
