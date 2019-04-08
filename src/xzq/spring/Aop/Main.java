package xzq.spring.Aop;

public class Main {
    public static void main(String[] args) {
//        ArithemeticCalculator arithemeticCalculator =new ArithmeticCalculatorImpl();
//        int result=arithemeticCalculator.add(1,2);

        ArithemeticCalculator target=new ArithmeticCalculatorImpl();
        ArithemeticCalculator proxy=new ArithemeticCalculatorLogProxy(target).getLoggingProxy();
        int result=proxy.add(1,2);
        System.out.println(result);
    }
}
