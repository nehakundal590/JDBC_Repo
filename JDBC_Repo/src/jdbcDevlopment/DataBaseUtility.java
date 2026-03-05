package jdbcDevlopment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtility {
	static Connection con;
	public static Connection getConnection()throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://locslhost:3307/shopping_app");
		return con;
		
	}
	public static void closeConnection() throws SQLException{
		con.close();
	}

}
