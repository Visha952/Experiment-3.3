package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import dao.StudentDAO;
import dao.StudentDAOImpl;
import service.StudentService;
import service.StudentServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public StudentDAO studentDAO() {
        return new StudentDAOImpl();
    }

    @Bean
    public StudentService studentService() {
        return new StudentServiceImpl(studentDAO());
    }
}
