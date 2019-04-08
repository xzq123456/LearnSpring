package xzq.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xzq.spring.annotation.Controller.UserController;
import xzq.spring.annotation.repository.UserRepository;
import xzq.spring.annotation.service.UserService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/bean-annotation.xml");
//        TestObject testObject= (TestObject)ctx.getBean("testObject");
//        System.out.println(testObject);

        UserController userController=(UserController)ctx.getBean("userController");
//        System.out.println(userController);
        userController.execute();
//        UserController execute()
//        UserService add()
//        UserRepositoryImpl  save()
//
//        UserService userService=(UserService)ctx.getBean("userService");
//        System.out.println(userService);

//        UserRepository userRepository =(UserRepository)ctx.getBean("userRepository");
//        System.out.println(userRepository);

        //四个bean已经被IOC容器装配好了
//        xzq.spring.annotation.TestObject@6eda5c9
//        xzq.spring.annotation.Controller.UserController@55b7a4e0
//        xzq.spring.annotation.service.UserService@5f058f00
//        xzq.spring.annotation.repository.UserRepositoryImpl@192d43ce


    }
}
