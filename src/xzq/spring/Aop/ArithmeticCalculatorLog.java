package xzq.spring.Aop;

public class ArithmeticCalculatorLog implements ArithemeticCalculator {
    @Override
    public int add(int i, int j) {
        System.out.println("The method add start with["+i+","+j+"]");
        int result=i+j;
        System.out.println("The method add end with"+result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        System.out.println("The method sub start with["+i+","+j+"]");
        int result=i-j;
        System.out.println("The method sub end with  "+result);
        return result;
    }

    @Override
    public int muti(int i, int j) {
        System.out.println("The method muti start with["+i+","+j+"]");
        int result=i*j;
        System.out.println("The method muti with"+result);
        return result;
    }

    @Override
    public int dev(int i, int j) {
        System.out.println("The method div start with["+i+","+j+"]");
        int result=i/j;
        System.out.println("The method div end with"+result);
        return result;
    }
}
