package xzq.spring.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 直接调用一个类的静态方法返回bean的实例
 */
public class StaticCarFactory {
    private static Map<String,Car> cars=new HashMap<>();
    static {
        cars.put("audi",new Car("Audi",200000));
        cars.put("ford",new Car("Ford",400000));
    }
    public static Car getCar(String name){
       return cars.get(name);
    }
}
