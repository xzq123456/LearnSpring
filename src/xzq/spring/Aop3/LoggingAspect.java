package xzq.spring.Aop3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

import java.util.Arrays;
import java.util.List;



public class LoggingAspect {
   public  void beforeMethod(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        List<Object> args=Arrays.asList(joinPoint.getArgs());
       System.out.println("before method"+methodName+"begin with "+args);
   }

    public  void afterMethod(JoinPoint joinPoint){
        String methodName=joinPoint.getSignature().getName();
        System.out.println("method  "+methodName+"  end ");
    }

  public  void afterReturning(JoinPoint joinPoint,Object result){
        String methodName=joinPoint.getSignature().getName();
      System.out.println("method  "+methodName+"  ends with "+result);
  }

  public  void afterThrowing(JoinPoint joinPoint,Exception ex){
      String methodName=joinPoint.getSignature().getName();
      System.out.println("method  "+methodName+"  occur with "+ex);

  }


  public Object aroundMethod(ProceedingJoinPoint proceedingJoinPoint){
       Object result=null;
       String methodName=proceedingJoinPoint.getSignature().getName();
       try {
           //前置通知
           System.out.println("The method  "+methodName+"begins with "+Arrays.asList(proceedingJoinPoint.getArgs()));
           result=proceedingJoinPoint.proceed();
           //返回通知
           System.out.println("The method"+methodName+" return  "+ result);
       } catch (Throwable throwable) {
           //异常通知
           System.out.println("the method"+methodName+"ouucr with "+throwable);
           throw new RuntimeException(throwable);
           //throwable.printStackTrace();
       }
       //后置通知
       System.out.println("The method  "+methodName+"  ends");
       return  result;
   }


}
