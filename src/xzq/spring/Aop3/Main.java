package xzq.spring.Aop3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/bean-Aop3.xml");
      ArithemeticCalculator arithemeticCalculator=(ArithemeticCalculator)ctx.getBean(ArithemeticCalculator.class);
      int result=arithemeticCalculator.add(1,2);
        System.out.println(result);
//        result=arithemeticCalculator.dev(1,0);
//        System.out.println(result);
    }
}
