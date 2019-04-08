package xzq.spring.SPEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mian {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/bean-spel.xml");
        Address address =(Address) ctx.getBean("address");
        System.out.println(address);

        Car car=(Car)ctx.getBean("car");
        System.out.println(car);

        Person p=(Person)ctx.getBean("person");
        System.out.println(p);


    }
}
