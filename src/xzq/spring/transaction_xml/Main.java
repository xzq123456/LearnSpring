package xzq.spring.transaction_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class Main {
    private ApplicationContext  context=null;
    private BookshopDao bookshopDao=null;
    private BookShopService bookShopService=null;
    private Cashier cashier=null;

    {
        context =new ClassPathXmlApplicationContext("xzq/spring/transaction_xml/bean_xml.xml");
        bookshopDao= (BookshopDao) context.getBean("bookShopDao");
        bookShopService=(BookShopService)context.getBean("bookShopService");
        cashier =(Cashier)context.getBean("cashier");

    }
    //测试事务的传播行为
    @Test
    public void testTransactionalPropagetion(){
//        List<String> isdns=new ArrayList<>();
//        isdns.add("1001");
//        isdns.add("1002");
        cashier.checkout("AA",Arrays.asList("1001","1002"));
    }

    @Test
    public  void testBookShopService(){

        bookShopService.purchase("AA","1001");
    }

}
