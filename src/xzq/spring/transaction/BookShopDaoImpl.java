package xzq.spring.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("bookShopDao")
public class BookShopDaoImpl implements BookshopDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public int findBookPriceByIsbn(String isbn) {
       String sql="select price from book where isbn = ?";
      return  jdbcTemplate.queryForObject(sql,Integer.class,isbn);
    }

    @Override
    public void updateBookstock(String isbn) {
        //检查库存是否足够
        String sql2="select stock from book_stock where isbn=?";
        int stock=jdbcTemplate.queryForObject(sql2,Integer.class,isbn);
        if(stock==0){
                  throw new BookStockException("库存不足");
        }
        String sql="update book_stock set stock=stock-1 where isbn= ?";
        jdbcTemplate.update(sql,isbn);

    }

    @Override
    public void updateUserBalanceaccount(String username, int price) {
        String sql2="select balance from account where username=?";
        Integer balance = jdbcTemplate.queryForObject(sql2, Integer.class, username);
        if(balance<price){
            throw new  UserAccountException("余额不足");
        }

        String sql="update account set balance=balance-? where username=?";
          jdbcTemplate.update(sql,price,username);
    }
}
