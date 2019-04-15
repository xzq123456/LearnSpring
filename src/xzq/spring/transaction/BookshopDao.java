package xzq.spring.transaction;

public interface BookshopDao {
    //根据书号获取单价
    public  int findBookPriceByIsbn(String isbn);
    //根据书号更新库存
    public void updateBookstock(String isbn);
    //g跟新用户账号 使用户的balance-price
    public void updateUserBalanceaccount(String username,int price);
}
