package jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection2 {
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","1234");
		System.out.println("sucess");
		
	}

}
