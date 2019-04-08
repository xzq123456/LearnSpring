package xzq.spring.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/beans-autowire.xml");
        Person p =(Person)ctx.getBean("person");
        System.out.println(p);


    }
}
