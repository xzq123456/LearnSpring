package xzq.spring.generic.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xzq.spring.generic.di.UserService;
public class Mian {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/bean-generic.di.xml");

        UserService  userService=(UserService)ctx.getBean("userService");
        userService.add();

    }
}
