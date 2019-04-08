package xzq.spring.Aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.SortedMap;

public class ArithemeticCalculatorLogProxy {
    private ArithemeticCalculator target;
    public ArithemeticCalculatorLogProxy(ArithemeticCalculator target){
        this.target=target;
    }
    public  ArithemeticCalculator getLoggingProxy(){
        ArithemeticCalculator proxy=null;
        ClassLoader loader =target.getClass().getClassLoader();
        Class [] interfaces=new Class[]{ArithemeticCalculator.class};
        InvocationHandler h=new InvocationHandler() {
            /**
             *
             * @param proxy proxy是不使用的
             * @param method 正在被调用的方法
             * @param args 调用方法的时候传入的参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
               String methodName=method.getName();
                System.out.println(" xzq  >>The method"+methodName+"begin with"+ Arrays.asList(args));
                Object result=null;
                try {
                    //前置通知
                    result=method.invoke(target,args);
                    //返回通知 可以访问到方法的返回值
                }catch (Exception e){
                    e.printStackTrace();
                    //异常通知  访问到异常
                }
                //后置通知 访问不到方法的返回值，因为可能有异常

                System.out.println("xzq >> The method "+methodName+"end with   "+result);
                return result;
            }
        };
        proxy= (ArithemeticCalculator) Proxy.newProxyInstance(loader,interfaces,h);

        return proxy;
    }
}
