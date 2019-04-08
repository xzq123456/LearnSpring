package xzq.spring.colletions;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    @Test
    public void test(){
        ApplicationContext cxt=new ClassPathXmlApplicationContext("xzq/spring/applicationContext.xml");
//        Person p=(Person)cxt.getBean("person3");
//        System.out.println(p);
//        Person{name='Mike', age=32, cars=[Car{brand='Audi', corp='shanghai', price=300000.0, maxSpeed=288}, Car{brand='BMW', corp='<shanghai>', price=0.0, maxSpeed=222}]}


//        NewPerson newPerson=(NewPerson)cxt.getBean("newperson");
//        System.out.println(newPerson);
           //properties赋值
//        DataSource dataSource=cxt.getBean(DataSource.class);
//        System.out.println(dataSource.getProperties());
//        {driverClass=com.mysql.jdbc.Driver, password=1234, jdbcUrl=jdbc:mysql://test, username=root}

         //配置集合bean
//        Person p4=(Person)cxt.getBean("person4");
//        System.out.println(p4);
        //使用p命名空间
        Person p5=(Person)cxt.getBean("person5");
        System.out.println(p5);


    }
}
