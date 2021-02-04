package FinalTest;

import java.sql.*;

public class CompanyMysqlDemoTest {

    private static void initializeDB() {
        Statement stmt = null;
        Connection c = null;
        ResultSet rs = null;
        //ArrayList rs = new ArrayList() ;
        try {

            Class.forName("org.sqlite.JDBC");

            // 2.建立数据库连接
            c = DriverManager.getConnection("jdbc:sqlite://D://student.db");

            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();

            // 3.ִ执行sql statement
            rs = stmt.executeQuery("select * from COMPANY;");

           // System.out.println(getResultSetMetaData(rs));

            while (rs.next()) {
                String id = rs.getString(1);
                String name = rs.getString(2);
                String age = rs.getString(3);

                System.out.print(id + "\t");
                System.out.print(name + "\t");
                System.out.print(age + "\t");
                System.out.printf("%10s", rs.getString(4) + "\t");
                System.out.print(rs.getString(5));

                System.out.println();
            }

            // 4。关闭数据库资源

        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        } finally {

//        stmt.close();
//        c.close();

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (c != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            if (rs != null) {
                try {
                    c.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}


