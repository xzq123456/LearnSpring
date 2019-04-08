package xzq.spring.Aop3;

import org.aspectj.lang.JoinPoint;

import java.util.Arrays;

public class ValidationAspect {

    public void volidation(JoinPoint joinPoint){
        System.out.println("validation " + Arrays.asList(joinPoint.getArgs()));
    }
}
