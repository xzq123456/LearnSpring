package xzq.spring.Scope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xzq.spring.Autowire.Car;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/bean-scope.xml");
        Car car=(Car)ctx.getBean("car");
        Car car2=(Car)ctx.getBean("car");
        //System.out.println(car==car2);//true 说明默认ioc创建 的bean对象是单例的 scope="singleton"
        System.out.println(car==car2); //scope="prototype" false
        //Constructor--------------
        //Constructor--------------
        //false
        //可以清楚看见初始化了两次  但是当只执行第9行代码时  初始化还不会去创建bean


    }
}
