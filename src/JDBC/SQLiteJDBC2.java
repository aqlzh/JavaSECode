package JDBC;


import java.sql.*;

public class SQLiteJDBC2
{
    //返回一张表的字段
    public static String getResultSetMetaData(ResultSet rs){
        StringBuffer sb = new StringBuffer();

        try {
            ResultSetMetaData md = rs.getMetaData();
            int size = md.getColumnCount();

            for (int i = 1; i <= size; i++) {
                sb.append(md.getColumnName(i)+"\t");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        return sb.toString();

    }
    public static void main( String args[] )
    {
        Connection c = null;
        Statement stmt = null;
        ResultSet rs = null ;
        try {


            // 1.加载数据库驱动    动态加载   反射
            Class.forName("org.sqlite.JDBC");

            // private String url = "jdbc:sqlite://e:/workspace/StudentSystem/Student.db"
            // c = DriverManager.getConnection("jdbc:sqlite://C://sqlite3//student.db");

            // 2.建立数据库连接
            c = DriverManager.getConnection("jdbc:sqlite://D://DB1.db");

            c.setAutoCommit(false);
            System.out.println("Opened database successfully");



            stmt = c.createStatement();

            // 3.ִ执行sql statement
            rs = stmt.executeQuery( "select * from COMPANY;" );

            System.out.println(getResultSetMetaData(rs));

            while ( rs.next() ) {
                String  id = rs.getString(1);
                String  name    = rs.getString(2);
                String  age = rs.getString(3);

                System.out.print(  id   + "\t");
                System.out.print(  name + "\t");
                System.out.print(  age + "\t");
                System.out.printf( "%10s", rs.getString(4) +"\t");
                System.out.print(  rs.getString(5) );

                System.out.println();
            }

            // 4。关闭数据库资源

        } catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            System.exit(0);
        }   finally {

//        stmt.close();
//        c.close();

            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(c != null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            if(rs != null){
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Operation done successfully");
    }
}