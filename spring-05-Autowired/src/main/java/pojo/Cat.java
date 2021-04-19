package pojo;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat {
    public void shout(){
        System.out.println("喵~");
    }
}
