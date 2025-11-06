package service;

import dao.StudentDAO;
import model.Student;

public class StudentServiceImpl implements StudentService {

    private StudentDAO dao;

    public StudentServiceImpl(StudentDAO dao) { this.dao = dao; }

    public void payFee(int id, double amount) {
        Student s = dao.getStudent(id);
        s.setFee(s.getFee() + amount);
        dao.updateStudent(s);
        System.out.println("Fee Paid Successfully!");
    }

    public void refundFee(int id, double amount) {
        Student s = dao.getStudent(id);
        s.setFee(s.getFee() - amount);
        dao.updateStudent(s);
        System.out.println("Fee Refunded Successfully!");
    }
}
