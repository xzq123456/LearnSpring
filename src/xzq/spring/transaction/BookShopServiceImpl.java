package xzq.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService {
    @Autowired
    private BookshopDao bookshopDao;
    //默认使用调用方法的事务Propagation.REQUIRED
    //Propagation.REQUIRES_NEW 新开一个事务
    // Isolation事务的隔离界别
    //norollbackFor 对那些异常类不回滚
    // readOnly 只读事务
    //timeout 指定强制回滚前事务执行的时间
    @Transactional(propagation = Propagation.REQUIRES_NEW,isolation = Isolation.READ_COMMITTED,
//            noRollbackFor ={UserAccountException.class}
            readOnly = false
//            timeout = 2
            )
    @Override
    public void purchase(String username, String isdn) {
//        try {
//            Thread.sleep(3000);
//           //强制回滚 Transaction timed out: deadline was Mon Apr 15 20:25:54 CST 2019
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        int price=bookshopDao.findBookPriceByIsbn(isdn);
        bookshopDao.updateBookstock(isdn);
        bookshopDao.updateUserBalanceaccount(username,price);
    }
}
