package xzq.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("cashier")
public class CashierImpl implements Cashier {
    @Autowired
    private  BookShopService bookShopService;
    @Transactional
    @Override
    public void checkout(String username, List<String> isbns) {
        //事务的传播行为
     for(String isbn:isbns){
        bookShopService.purchase(username,isbn);
     }
    }
}
