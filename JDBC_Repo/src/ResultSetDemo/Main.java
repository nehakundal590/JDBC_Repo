package ResultSetDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/shopping_app","root","1234");
		PreparedStatement ps=con.prepareStatement("select*from user",ResultSet.TYPE_FORWARD_ONLY);
		ResultSet rs=ps.executeQuery();
		//it will point the result cursor after the last row
		rs.afterLast();
		//it will fetch the data in backword direction
	while(	rs.previous()) {
		
		
			String myname=rs.getString("name");
			String myemail=rs.getString("email");
			System.out.println("name"+myname);
			System.out.println(myname+"-"+myemail+"-");
	}
		
		rs.close();
		ps.close();
		con.close();
	}

}
