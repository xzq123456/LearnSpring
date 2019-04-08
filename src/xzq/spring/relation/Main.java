package xzq.spring.relation;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xzq.spring.Autowire.Address;
import xzq.spring.Autowire.Person;

public class Main {
    @Test
    public  void  test(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/beans-relation.xml");
//        Address address=(Address)ctx.getBean("address");
//        System.out.println(address);
//
//        Address address=(Address)ctx.getBean("address2");
//        System.out.println(address);

        Person p=(Person)ctx.getBean("person");
        System.out.println(p);
    }
}
