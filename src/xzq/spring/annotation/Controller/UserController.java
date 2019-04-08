package xzq.spring.annotation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import xzq.spring.annotation.service.UserService;

//模拟表现层
//  需要配置bean之间的联系
@Controller
public class UserController {
    //位置1  @Autowired
    private UserService userService;
    //位置2（等同于位置1）
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public  void execute(){
        System.out.println("UserController execute()");
        userService.add();
    }

}
