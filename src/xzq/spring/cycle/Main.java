package xzq.spring.cycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/bean-cycle.xml");
        Car car=(Car)ctx.getBean("car");
        System.out.println(car);

        ctx.close();
//        cars constructor..
//        set brand...
//        init
//        xzq.spring.cycle.Car@5bcab519  返回bean
 //       destroy

        //加入后置处理器
//        cars constructor..
//        set brand...
//        beforexzq.spring.cycle.Car@59ec2012 car
//        init
//        afterxzq.spring.cycle.Car@59ec2012 car
//        xzq.spring.cycle.Car@59ec2012
//        destroy

        //换掉car
//        cars constructor..
//        set brand...
//        beforeCar{brand='Audi'} car
//                init
//        afterCar{brand='Audi'} car
//        cars constructor..
//        set brand...
//        Car{brand='bmw'}
//        destroy


    }
}
