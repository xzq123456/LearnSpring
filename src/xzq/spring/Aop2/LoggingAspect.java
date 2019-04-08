package xzq.spring.Aop2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

//声明为一个切面:需要先把该类放入IOC容器中，然后在声明为切面
//还要告诉方法
//order 指定切面的优先级，值越小优先级越大
//重用切面表达式

@Order(1)
@Aspect
@Component
public class LoggingAspect {
    //定义一个方法用于声明切入点表达式  使用pointcut来声明切入点表达式
    @Pointcut("execution(public int xzq.spring.Aop2.ArithmeticCalculatorImpl.*(int,int))")
    public void  declareJoinpointException(){

    }


    //在main调用的方法与注解的方法一致的时候，会自动为该方法所在的类生成代理对象，并先执行该方法
//    @Before("execution(public int xzq.spring.Aop2.ArithmeticCalculatorImpl.add(int,int))")
    //Aspect 表达式  @Before("execution(public int xzq.spring.Aop2.ArithmeticCalculatorImpl.*(int,int))")
    @Before("declareJoinpointException()")
    //Joinpoint访问连接的细节
   public  void beforeMethod(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        List<Object> args=Arrays.asList(joinPoint.getArgs());
       System.out.println("before method"+methodName+"begin with "+args);
   }
//   //后置通知（无论是否发生异常）
////    @After("execution(* xzq.spring.Aop2.ArithmeticCalculatorImpl.*(int,int))")
////    public  void afterMethod(JoinPoint joinPoint){
////        String methodName=joinPoint.getSignature().getName();
////        System.out.println("method  "+methodName+"  end ");
////    }
//  //返回通知  方法正常结束后执行（可以访问到返回值）
//  @AfterReturning(value="execution(* xzq.spring.Aop2.ArithmeticCalculatorImpl.*(int,int))",returning ="result")
//  public  void afterReturning(JoinPoint joinPoint,Object result){
//        String methodName=joinPoint.getSignature().getName();
//      System.out.println("method  "+methodName+"  ends with "+result);
//  }
//
//  @AfterThrowing(value = "execution(* xzq.spring.Aop2.ArithmeticCalculatorImpl.*(int,int))",throwing = "ex")
//  //可以指定捕获的异常，即出现特定异常的时候会执行方法里的代码
//  public  void afterThrowing(JoinPoint joinPoint,Exception ex){
//      String methodName=joinPoint.getSignature().getName();
//      System.out.println("method  "+methodName+"  occur with "+ex);
//   //   method  dev  occur with java.lang.ArithmeticException: / by zero
//
//  }
  //环绕通知

    /**
     * ProceedingJoinPoint
     * 类似于动态代理的全过程
     * 必须有返回值  为目标方法的返回值
     */
//   @Around("execution(* xzq.spring.Aop2.ArithmeticCalculatorImpl.*(int,int))")
//  public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
//       Object result=null;
//       String methodName=proceedingJoinPoint.getSignature().getName();
//       try {
//           //前置通知
//           System.out.println("The method  "+methodName+"begins with "+Arrays.asList(proceedingJoinPoint.getArgs()));
//           result=proceedingJoinPoint.proceed();
//           //返回通知
//           System.out.println("The method"+methodName+" return  "+ result);
//       } catch (Throwable throwable) {
//           //异常通知
//           System.out.println("the method"+methodName+"ouucr with "+throwable);
//           throw new RuntimeException(throwable);
//           //throwable.printStackTrace();
//       }
//       //后置通知
//       System.out.println("The method  "+methodName+"  ends");
//       return  result;
//   }


}
