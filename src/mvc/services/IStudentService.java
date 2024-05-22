package mvc.services;

import mvc.models.Student;

public interface IStudentService {
    public boolean add(Student student);
    public void delete(Student student);
}
