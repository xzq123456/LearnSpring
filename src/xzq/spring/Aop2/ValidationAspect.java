package xzq.spring.Aop2;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.Arrays;
//指定切面的优先级
@Order(2)
@Aspect
@Component
public class ValidationAspect {
    //不同包下还要指定包名
    @Before("xzq.spring.Aop2.LoggingAspect.declareJoinpointException()")
    public void volidation(JoinPoint joinPoint){
        System.out.println("validation " + Arrays.asList(joinPoint.getArgs()));
    }
}
