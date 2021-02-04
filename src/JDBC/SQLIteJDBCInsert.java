package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;




public class SQLIteJDBCInsert {


    /**
     * account表 添加一条记录 insert 语句
     */

        public static void main(String[] args) {
            Statement stmt = null;
            Connection conn = null;
            try {
                //1. 注册驱动
//                Class.forName("com.mysql.jdbc.Driver");
                Class.forName("org.sqlite.JDBC");
                //2. 定义sql
                String sql = "insert into COMPANY(ID,NAME,AGE,ADDRESS,SALARY) values(7,'王五',30,'shanghai',10)";
                //3.获取Connection对象
               // conn = DriverManager.getConnection("jdbc:mysql:///db", "root", "rootlzh");
                conn = DriverManager.getConnection("jdbc:sqlite://D://student.db");
                //4.获取执行sql的对象 Statement
                stmt = conn.createStatement();
                //5.执行sql
                int count = stmt.executeUpdate(sql);//影响的行数
                //6.处理结果
                System.out.println(count);
                if(count > 0){
                    System.out.println("添加成功！");
                }else{
                    System.out.println("添加失败！");
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }finally {
                //stmt.close();
                //7. 释放资源
                //避免空指针异常
                if(stmt != null){
                    try {
                        stmt.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }

                if(conn != null){
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }


        }


}
