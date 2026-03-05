
package jdbcDevlopment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Program2{
public static void main(String[] args) {
	String DRIVER_CLASS="com.mtsql.cj.jdbc.Driver";
	String URL="jdbc:mysql://localhost:3307/shopping_app";
	String USERNAME="root";
	String Password="1234";
	String sql_query="insert into users values(?,?,?)";
	
	try {
		Class.forName(DRIVER_CLASS);
		Connection con=DriverManager.getConnection(URL,USERNAME,Password);
		
		try (
		Connection con1=DriverManager.getConnection(URL,USERNAME,Password);
		PreparedStatement	 ps=con1.prepareStatement("sql_query");
			)
	{
		
	
	ps.setString(1, "mukal");
	ps.setString(1, "mukal@123");
	ps.setString(1, "1234");
	
	int count=ps.executeUpdate();
	if(count>0) {
		System.out.println("sucess");
	}else {
		System.out.println("fail");
	}
	}
		
	}catch(ClassNotFoundException|SQLException e) {
		e.printStackTrace();
	}
	
}
}
