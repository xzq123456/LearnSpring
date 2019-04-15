package xzq.spring.SPEL2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
   @Test
    public void test(){
       ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/SPEL2/bean.xml");
       Person person=(Person)ctx.getBean("person");
       System.out.println(person);
   }
}
