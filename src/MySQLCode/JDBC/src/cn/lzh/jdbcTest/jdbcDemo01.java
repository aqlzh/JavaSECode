package cn.lzh.jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

// 加载驱动  用户信息和URL   执行SQL 语句      查看  释放链接
public class jdbcDemo01 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1. 导入驱动jar包
        //2.注册驱动
         Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
//        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "root");
        Connection conn = DriverManager.getConnection("jdbc:mysql:///db", "root", "rootlzh");

        //4.定义sql语句
//        String sql = "update account set balance = 2000 where id = 1";
        String sql = "update emp set salary = 10000 where id =1";
        //5.获取执行sql的对象 Statement
        Statement stmt = conn.createStatement();
        //6.执行sql
        int count = stmt.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        stmt.close();
        conn.close();

    }
}
