package xzq.spring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/bean-factory.xml");
        Car car=(Car)ctx.getBean("car1");
        System.out.println(car);
//        Car{brand='Audi', price=200000.0}
        Car car2=(Car)ctx.getBean("car2");
        System.out.println(car2);
//        Car{brand='Ford', price=400000.0}
    }
}
