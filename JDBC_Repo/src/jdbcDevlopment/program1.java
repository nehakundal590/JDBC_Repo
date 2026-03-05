package jdbcDevlopment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class program1 {
public static void main(String[] args) {
	String DRIVER_CLASS="com.mtsql.cj.jdbc.Driver";
	String URL="jdbc:mysql://localhost:3307/shopping_app";
	String USERNAME="root";
	String Password="1234";
	Connection con=null;
	PreparedStatement ps=null;
	try {
		Class.forName(DRIVER_CLASS);
		con=DriverManager.getConnection(URL,USERNAME,Password);
		String sql_query="insert into users values(?,?,?)";
	 ps=	con.prepareStatement("sql_query");
	ps.setString(1, "swati");
	ps.setString(1, "swati@123");
	ps.setString(1, "1234");
	
	int count=ps.executeUpdate();
	if(count>0) {
		System.out.println("sucess");
	}else {
		System.out.println("fail");
	}
	ps.close();
	con.close();
		
	}catch(ClassNotFoundException|SQLException e) {
		e.printStackTrace();
	}
	finally {
		try {
			if(ps!=null) {
				ps.close();
				con.close();
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
	try {
		if(con!=null) {
			
			con.close();
			
		}
	
	}catch(SQLException e) {
		e.printStackTrace();
		
	}
	}
}
}
