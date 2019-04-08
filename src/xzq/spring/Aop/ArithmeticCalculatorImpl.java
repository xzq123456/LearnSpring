package xzq.spring.Aop;

public class ArithmeticCalculatorImpl implements ArithemeticCalculator {
    @Override
    public int add(int i, int j) {

        int result=i+j;

        return result;
    }

    @Override
    public int sub(int i, int j) {

        int result=i-j;

        return result;
    }

    @Override
    public int muti(int i, int j) {

        int result=i*j;

        return result;
    }

    @Override
    public int dev(int i, int j) {

        int result=i/j;

        return result;
    }
}
