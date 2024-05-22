package mvc.services.impl;

import mvc.models.Student;
import mvc.repositories.StudentRepository;
import mvc.services.IStudentService;

public class StudentService implements IStudentService {
    private StudentRepository studentRepository = new StudentRepository();
    @Override
    public boolean add(Student student) {
        if(student.getName().equals("")) {
            return false;
        }
        if(student.getCode() <0 || student.getCode()>1000000) {
            return false;
        }
        for(Student s : studentRepository.getStudents()) {
            if(s.getCode() == student.getCode()) {
                return false;
            }
        }
        studentRepository.add(student);
        return true;
    }
    public Student checkStudent(int code) {
        for (Student student : studentRepository.getStudents()){
            if(student.getCode() == code){
                return student;
            }
        }
        return null;
    }

    public void delete(Student student) {
        studentRepository.delete(student);
    }

    public String displayAll() {
        String str="";
        for (Student student : studentRepository.getStudents()){
            str += "code: "+student.getCode()+", name: "+student.getName()+"\n";
        }
        return str;
    }
}
