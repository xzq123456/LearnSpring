package xzq.spring.transaction;

import java.util.List;
//一个人可以买多本书
public interface Cashier  {
    public  void checkout(String username, List<String> isbns);
}
