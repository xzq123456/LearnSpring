package xzq.spring.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 实力工厂方法  先创建工厂本身  在调用实例方法返回实例
 */
public class InstanceCarFactory {
    private static Map<String,Car> cars;
    public InstanceCarFactory(){
        cars=new HashMap<>();
        cars.put("audi",new Car("Audi",200000));
        cars.put("ford",new Car("Ford",400000));
    }

    public Car getCar(String brand){
        return cars.get(brand);
    }
}
