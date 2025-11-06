package service;

public interface StudentService {
    void payFee(int id, double amount);
    void refundFee(int id, double amount);
}
