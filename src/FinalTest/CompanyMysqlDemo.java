package FinalTest;


import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CompanyMysqlDemo {

    private static Statement stmt;
    static Connection connection;
    static ArrayList list=new ArrayList();
    private static void initializeDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            System.out.println("Driver loaded");
            connection =DriverManager.getConnection("jdbc:sqlite://D://student.db");
            System.out.println("Database connected");
            stmt=connection.createStatement();

        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    public static ArrayList getResultSetString() {
        initializeDB();
        try {
            ResultSet  rs = stmt.executeQuery("select * from COMPANY;") ;

               while ( rs.next() ) {
                Company comp = new Company() ;
                comp.setId(rs.getInt(1));
                comp.setName(rs.getString(2));
                comp.setAge(rs.getInt(3));
                comp.setAddress(rs.getString(4));
                comp.setSalary(rs.getDouble(5));

                list.add(comp) ;
            }
               connection.close();
               stmt.close();
               rs.close();
        } catch ( Exception e ) {
//            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//            System.exit(0);
        }
        return  list ;
    }
}
