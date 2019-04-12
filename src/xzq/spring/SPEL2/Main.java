package xzq.spring.SPEL2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/SPEL2/bean.xml");
        Person person=(Person)ctx.getBean("person");
        System.out.println(person);
    }
}
