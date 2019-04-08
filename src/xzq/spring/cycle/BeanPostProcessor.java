package xzq.spring.cycle;

import org.springframework.beans.BeansException;
//<!--bean的后置处理器允许在调用初始化方法前对Bean进行额外的处理-->
//
public class BeanPostProcessor implements org.springframework.beans.factory.config.BeanPostProcessor {
    @Override
//    init()之前调用的方法
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before"+bean+" "+beanName);
        //后置处理器是处理所有的bean 所以可以加一个验证
//        if("car".equals(beanName))
//        {}
        return bean;
    }
    //    init()之后调用的方法
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after"+bean+" "+beanName);
        Car car=new Car();
        car.setBrand("bmw");
        return car;
    }
}
