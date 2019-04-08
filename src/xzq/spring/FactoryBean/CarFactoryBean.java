package xzq.spring.FactoryBean;

import org.springframework.beans.factory.FactoryBean;

//通过factory bean
public class CarFactoryBean implements FactoryBean<Car> {
    //返回bean的对象
    private String brand;
    public void setBrand(String brand){
        this.brand=brand;
    }
    @Override
    public Car getObject() throws Exception {
        return new Car(brand,590000);
    }
  //返回bean的类型
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }
 //是不是单实例的
    @Override
    public boolean isSingleton() {
        return true;
    }
}
