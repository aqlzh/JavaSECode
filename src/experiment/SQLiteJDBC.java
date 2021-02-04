package experiment;

import java.sql.*;

public class SQLiteJDBC {
    public  static  String getResultSetMetaData(ResultSet rs){
        StringBuffer sb = new StringBuffer() ;
        try {
            ResultSetMetaData md = rs.getMetaData() ;
            int size = md.getColumnCount() ;

            for (int i = 1; i <= size; i++) {
                sb.append(md.getColumnName(i) + "\t") ;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return sb.toString() ;
    }

    public static void main(String[] args) {
        Connection c = null ;
        Statement stmt = null ;

        try{
            //Class.forName("org.sqlite.JDBC") ;
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql:///db", "root", "rootlzh");
           // c = DriverManager.getConnection("jdbc:sqlite:D://A.db") ;

            c.setAutoCommit(false);
            System.out.println("Opened database successful");

            stmt = c.createStatement() ;

            ResultSet rs = stmt.executeQuery("select * from COMPANY") ;

            System.out.println(getResultSetMetaData(rs));

            while (rs.next()){
                String id = rs.getString(1) ;
                String name = rs.getString(2) ;
                String age = rs.getString(3) ;

                System.out.println( id + "\t");
                System.out.println( name + "\t");
                System.out.println( age + "\t");
              //  System.out.println( "%d",rs.getString(4)+ "\t");
                System.out.println( rs.getString(5));

                System.out.println();
            }

            rs.close();
            stmt.close();
            c.close();
         } catch (Exception e){
               System.err.println(e.getClass().getName()+":"+e.getMessage());
               System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
}
