import dao.UserDAOImpl;
import dao.UserDAOMysqlImpl;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        UserService userServiceImpl = (UserService) context.getBean("userServiceImpl");

        userServiceImpl.getUser();

//        //用户实际调用业务层，dao层不需要接触
//        UserService userService = new UserServiceImpl();
//
//        ((UserServiceImpl) userService).setUserDAO(new UserDAOMysqlImpl());


    }
}
