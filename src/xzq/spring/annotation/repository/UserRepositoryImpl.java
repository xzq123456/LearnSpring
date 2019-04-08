package xzq.spring.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import xzq.spring.annotation.TestObject;

//模拟持久化层
//@Repository("userRepository")  当把名字拿掉后 main方法就会出错 因为在service传入的是userRepository 而现在有两个都匹配的bean
//UserRepositoryImpl和UserJdbcRepository  报错expected single matching bean but found 2: userJdbcRepository,userRepositoryImpl
//当加上名字的时候  会根据这个bean的名字userRepository 刚好和service 属性userRepository一样 就可以了

//处理当匹配多个bean的方法
//1.方法一：声明bean的时候让bean的名字和要调用的属性名一致
//2.方法二：使用 @Qualifier("userRepositoryImpl")//首字母小写  指定调用的时候用的是那个bean
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Autowired(required = false)
    private TestObject testObject;
    @Override
    public void save() {
        System.out.println("UserRepositoryImpl  save()"+testObject);
    }
}
