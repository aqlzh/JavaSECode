package cn.lzh.qqLogin;
import java.sql.*;
public class LoginDao {
	PreparedStatement prestmt = null;
	Connection conn = null;
	ResultSet rs = null;
	// ��ѯ�û�
	public Boolean findUser(String qqnumber, String pwd) 
											throws SQLException {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/jdbc";
			String username = "root";
			String password = "rootlzh";

			conn = DriverManager.getConnection(url, username, password);

			String sql = "select * from tb_qquser " 
						+ "where qqnumber = ? " 
						+ "and password = ?";

			prestmt = conn.prepareStatement(sql);
			prestmt.setString(1, qqnumber);
			prestmt.setString(2, pwd);

			rs = prestmt.executeQuery();

			if (rs.next()) { return true; }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (rs != null) { rs.close(); }
			if (prestmt != null) { prestmt.close();	}
			if (conn != null) {	conn.close(); }
		}
		return false;
	}
}
