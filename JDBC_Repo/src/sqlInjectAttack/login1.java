
package sqlInjectAttack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class login1 {
	public static void main(String[] args)throws Exception {
		// get email id and password from users----------
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email Id:");
		String myemail=sc.nextLine();
		
		System.out.println("Enter Password");
		String mypass=sc.nextLine();
		
		// -----------database connection---------------
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/shopping_app","root","1234");
		Statement st=con.createStatement();
		
		//---------------sql query
	//ResultSet rs=	st.executeQuery("select * from users where email='"+myemail+"'AND password='"+mypass+"'");
		String sql_query="SELECT * from users WHERE email=?AND password=?";
		System.out.println(sql_query);
		
		//--------------------------------------------------------------------
		PreparedStatement ps=con.prepareStatement(sql_query);
		ps.setString(1, myemail);
		ps.setString(2, mypass);
		ResultSet rs=ps.executeQuery();
		
	
	if(rs.next()) {
		System.out.println("Welcome"+rs.getString("name"));
		
	}else {
		System.out.println("Email id and password didnt match");
		
	}
		
	}

}
