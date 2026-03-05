package sqlInjectAttack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class login {
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
		String sql_query="SELECT * from users WHERE email='"+myemail+"'AND password='"+mypass+"'";
		System.out.println(sql_query);
		
		//--------------------------------------------------------------------
		Statement st1=con.createStatement();
		ResultSet rs=st1.executeQuery(sql_query);
		
	
	if(rs.next()) {
		System.out.println("Welcome"+rs.getString("name"));
		
	}else {
		System.out.println("Email id and password didnt match");
		
	}
		
	}

}
