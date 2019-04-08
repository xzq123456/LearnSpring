package xzq.spring.properties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import javax.sql.DataSource;
import java.sql.SQLException;
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("xzq/spring/bean-properties.xml");
        DataSource dataSource= (DataSource) ctx.getBean("dataSource");
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //链接成功
//        com.mchange.v2.c3p0.impl.NewProxyConnection@5fcd892a [wrapping: com.mysql.jdbc.JDBC4Connection@8b87145]



 //通配符的匹配很全面, 但无法找到元素 'context:property-placeholder'
//        解决方案就是如下：
//        xmlns:context="http://www.springframework.org/schema/context"
//        同时在xsi:schemaLocation这个字符串中添加context相关的解析文件
//        http://www.springframework.org/schema/context
//        http://www.springframework.org/schema/context/spring-context-4.2.xsd。

    }
}
