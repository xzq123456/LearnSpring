package xzq.spring.transaction_xml;


import java.util.List;


public class CashierImpl implements Cashier {

    private BookShopService bookShopService;

    public void setBookShopService(BookShopService bookShopService) {
        this.bookShopService = bookShopService;
    }

    @Override
    public void checkout(String username, List<String> isbns) {
        //事务的传播行为
     for(String isbn:isbns){
        bookShopService.purchase(username,isbn);
     }
    }
}
