package xzq.spring.Aop2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/bean-Aop2.xml");
//      ArithemeticCalculator arithemeticCalculator=(ArithemeticCalculator)ctx.getBean(ArithemeticCalculator.class);
        ArithemeticCalculator arithemeticCalculator=(ArithemeticCalculator)ctx.getBean("arithmeticCalculator");
        System.out.println(arithemeticCalculator.getClass().getName());//com.sun.proxy.$Proxy8 代理对象  没配置成功就xzq.spring.Aop2.ArithmeticCalculatorImpl
      int result=arithemeticCalculator.add(1,2);
        System.out.println("result;"+result);
//        result=arithemeticCalculator.dev(10,0);
//        System.out.println("result;"+result);
    }
}
