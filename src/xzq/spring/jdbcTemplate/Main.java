package xzq.spring.jdbcTemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

        ApplicationContext context =null;
        JdbcTemplate jdbcTemplate=null;
        NamedParameterJdbcTemplate namedParameterJdbcTemplate=null;
//        EmployeeDao employeeDao=null;
    {
        context=new ClassPathXmlApplicationContext("xzq/spring/jdbcTemplate/bean.xml");
        jdbcTemplate=(JdbcTemplate)context.getBean("jdbcTemplate");
        namedParameterJdbcTemplate=(NamedParameterJdbcTemplate)context.getBean("namedParameterJdbcTemplate");
//        employeeDao=(EmployeeDao)context.getBean("employeeDao");
//        Employee employee = employeeDao.get(1);
//        System.out.println(employee);

    }

    @Test
    public void  testnamedParameterJdbcTemplate2(){
         //sql语句参数名和类的属性一致
        String sql="insert into employee(last_name,email,dept_id) values(:lastname,:email,:deptId)";
        //传入对象更新
        Employee employee=new Employee();
        employee.setLastname("YY");
        employee.setEmail("YY@163.com");
        employee.setDeptId(1);
        SqlParameterSource parameterSource=new BeanPropertySqlParameterSource(employee);
        namedParameterJdbcTemplate.update(sql,parameterSource);

    }
    //可以为参数取名字，参数多了维护性好
    @Test
    public void  testnamedParameterJdbcTemplate(){
        String sql="insert into employee(last_name,email,dept_id) values(:lastname,:email,:deptid)";
        Map<String,Object> paramap=new HashMap<>();
        paramap.put("lastname","gg");
        paramap.put("email","gg@163.com");
        paramap.put("deptid",2);
        namedParameterJdbcTemplate.update(sql,paramap);
    }
    //获取单个列的值或者
    @Test
    public void testQueryforObject2()
    {
        String sql="select count(id) from employee ";
        Long count = jdbcTemplate.queryForObject(sql, Long.class);
        System.out.println(count);
    }
    @Test
    public void QueryforList(){
        String sql="select id,last_name lastName,email from employee where id > ?";
        RowMapper<Employee> rowMapper=new BeanPropertyRowMapper<>(Employee.class);
        List<Employee> employees = jdbcTemplate.query(sql, rowMapper,6);
        System.out.println(employees);
    }

    @Test
    public void QueryForObject(){
     //从数据库获取一条记录，实际是一个对象
        //使用别名完成列名和属性名的映射
        //不能完成级联属性，jdbcTemplate是jdbc小工具，不是orm框架（对象-关系映射）
        String sql="select id,last_name lastName,email ,dept_id as \"dept.id\" from employee where id= ?";
        //rowMapper 如何映射每行的映射
        RowMapper<Employee> rowMapper =new BeanPropertyRowMapper<>(Employee.class);
        Employee employee = jdbcTemplate.queryForObject(sql,rowMapper,1);
        System.out.println(employee);
    }
    @Test
    public void testBatchUpdate(){
        String sql="insert into employee(last_name,email,dept_id) values (?,?,?)";
        //添加一条记录需要一个对象数组,很多条就是一个数组集合
        List<Object[]> batchargs=new ArrayList<>();
        batchargs.add(new Object[]{"AA","AA@163.com",2});
        batchargs.add(new Object[]{"BB","BB@163.com",2});
        batchargs.add(new Object[]{"CC","AA@163.com",2});
        jdbcTemplate.batchUpdate(sql,batchargs);
    }

    @Test
    public void testUpdate(){
        String sql="update employee set last_name =? where id= ? ";
        jdbcTemplate.update(sql,"Tom22",1);

    }

    @Test
    public void testDatasource(){
      DataSource dataSource=(DataSource)context.getBean("dataSource");
        try {
            System.out.println(dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
