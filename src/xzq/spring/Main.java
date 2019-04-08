package xzq.spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
//    @Test
//    public void test(){
////        HelloWorld helloWorld=new HelloWorld();
////        helloWorld.setName("xzq");
//        //创建Spring的ioc容器
//        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/applicationContext.xml");
//        //ClassPathXmlApplicationContext 从类路径下加载配置文件
//        //FileSystemXmlApplicationContext 从文件系统中加载配置文件
//
//
//        //从配置文件中获取Bean实例 使用id定位
//        HelloWorld helloWorld =(HelloWorld) ctx.getBean("helloWord");
//
//        //通过类型来获取bean  缺点：当配置文件中有两个相同类型的bean的时候会出错
////         HelloWorld helloWorld= ctx.getBean(HelloWorld.class);
//
//        //调用方法
//        helloWorld.hello();
//
//        //当注释15 17行
////        constructor ............
////        setName......
//        //说明在创建ioc容器的时候会调用对象的构造方法进行对象创建，而且调用set方法为对象属性赋值
//    }
    @Test
    public void test2(){
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/applicationContext.xml");
//        Car car= (Car) ctx.getBean("car");
//        System.out.println(car);
//        Car car2= (Car) ctx.getBean("car2");
//        System.out.println(car2);
        //使用位置index区分
//        Car{brand='Audi', corp='shanghai', price=300000.0, maxSpeed=0}
//        Car{brand='BMW', corp='shanghai', price=240.0, maxSpeed=0}
      //使用类型type区分
//        Car{brand='Audi', corp='shanghai', price=300000.0, maxSpeed=0}
//        Car{brand='BMW', corp='shanghai', price=0.0, maxSpeed=240}


//        Person p=(Person)ctx.getBean("person");
//        System.out.println(p);
//        Person{name='Ton', age=42, car=Car{brand='BMW', corp='<shanghai>', price=0.0, maxSpeed=222}}

        //测试集合bean
        Person p4=(Person)ctx.getBean("person4");
        System.out.println(p4);
        Person p5=(Person)ctx.getBean("person5");
        System.out.println(p5);

    }

}
