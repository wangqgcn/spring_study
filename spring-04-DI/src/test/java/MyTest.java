import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Student;

import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) context.getBean("student");

/**
 *  quint
 *  二仙桥
 *  [百年孤独, 西游记, 三国演义]
 *  [listen music, play computer game, movie]
 *  {身份证=1213143153111231442, 银行卡=1421263252414241412, 手机号=15623214343}
 *  [LOL, pubg, 天涯明月刀]
 *  null
 *  {版权=Riot Game, 代理=Tencent}
 */
        System.out.println(student.getName());
        System.out.println(student.getAddress().getAddress());
        System.out.println(Arrays.toString(student.getBooks()));
        System.out.println(student.getHobbys().toString());
        System.out.println(student.getCard().toString());
        System.out.println(student.getGames().toString());
        System.out.println(student.getWife());
        System.out.println(student.getInfo().toString());

    }
}
