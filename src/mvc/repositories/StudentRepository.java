package mvc.repositories;
import mvc.models.Student;

import java.util.Arrays;

public class StudentRepository {
        private static Student[] students = new Student[100];
        private static int count = 0;

        static {
            students[0] = new Student(1, "HaiTT", "Quảng Nam", "C1123G1");
            count = 1;
        }

        public void add(Student student) {
            students[count] = student;
            count++;
        }
        public Student[] getStudents() {
            Student[] temp = Arrays.copyOf(students, count);
            return temp;
        }

    public void delete(Student student) {
            int temp = 0;
            for (int i = 0; i < count; i++) {
                if (students[i].equals(student)) {
                    temp = i;
                    break;
                }
            }
            for (int i = temp; i < count-1; i++) {
                students[i] = students[i+1];
            }
            students[count-1] = null;
            count--;
    }
}
