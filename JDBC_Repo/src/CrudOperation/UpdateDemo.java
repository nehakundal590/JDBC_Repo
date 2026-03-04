package CrudOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateDemo {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3307/shopping_app","root","1234");
PreparedStatement ps=con.prepareStatement("UPDATE users SET city=?where email=?");
ps.setString(1, "mumbai");
ps.setString(2, "ravi@gmail.com");
int count=ps.executeUpdate();
if(count>0) {
	System.out.println("user update sucessfully");
}
else {
	System.out.println("user not update due to some error");
}

ps.close();
con.close();
		
	}

}
