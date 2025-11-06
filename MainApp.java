import config.AppConfig;
import model.Student;
import dao.StudentDAO;
import service.StudentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        StudentDAO dao = context.getBean(StudentDAO.class);
        StudentService service = context.getBean(StudentService.class);

        dao.addStudent(new Student(1, "Vishal", "Java", 5000));
        service.payFee(1, 2000);
        service.refundFee(1, 1000);

        System.out.println(dao.getAllStudents());

        context.close();
    }
}
