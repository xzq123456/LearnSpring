package xzq.spring.annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import xzq.spring.annotation.repository.UserRepository;

//模拟业务层
@Service
public class UserService {

    //指定装配的bean
    @Autowired
    @Qualifier("userRepositoryImpl")//首字母小写
    private UserRepository userRepository;

//    public void setUserRepository(UserRepository userRepository){
//        this.userRepository=userRepository
//    }

    public void add(){
        System.out.println("UserService add()");
        userRepository.save();
    }
}
