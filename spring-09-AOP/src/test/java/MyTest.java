import com.quint.service.UserService;
import com.quint.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        报错
//        UserServiceImpl userservice = context.getBean("userService", UserServiceImpl.class);

        //动态代理 代理的是接口
        UserService userservice = context.getBean("userService", UserService.class);

        userservice.delete();
    }
}
