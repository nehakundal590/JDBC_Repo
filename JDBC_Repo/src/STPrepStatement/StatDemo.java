package STPrepStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StatDemo {
	public static void main(String[] args)throws Exception {
		String myname="aaa";
		String myemail="aaa@gmail.com";
		String mypass="aa123";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=	DriverManager.getConnection("jdbc:mysql://localhost:3307/shopping_app","root","1234");
		
		Statement st=con.createStatement();
		//int count=st.executeUpdate("INSERT INTO users VALUES('"+myname+"','"+myemail+"','"+ mypass +"')");
		String query = "INSERT INTO users (name,email,password) VALUES('"
				+ myname + "','" + myemail + "','" + mypass + "')";
		int count = st.executeUpdate(query);
		if(count>0) {
			System.out.println("sucess");
		}
		else {
			System.out.println("fail");
		}
	}

}
