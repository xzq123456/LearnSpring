package xzq.spring.transaction_xml;


public class BookShopServiceImpl implements BookShopService {

    private BookshopDao bookshopDao;

    public void setBookshopDao(BookshopDao bookshopDao) {
        this.bookshopDao = bookshopDao;
    }

    @Override
    public void purchase(String username, String isdn) {
        try {
            Thread.sleep(3000);
           //强制回滚 Transaction timed out: deadline was Mon Apr 15 20:25:54 CST 2019
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int price=bookshopDao.findBookPriceByIsbn(isdn);
        bookshopDao.updateBookstock(isdn);
        bookshopDao.updateUserBalanceaccount(username,price);
    }
}
