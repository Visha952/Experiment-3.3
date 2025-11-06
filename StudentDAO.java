package dao;

import model.Student;
import java.util.List;

public interface StudentDAO {
    void addStudent(Student s);
    Student getStudent(int id);
    List<Student> getAllStudents();
    void updateStudent(Student s);
    void deleteStudent(int id);
}
