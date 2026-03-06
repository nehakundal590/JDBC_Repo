package Transactionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainApp {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/shopping_app","root","1234");
		PreparedStatement ps1=con.prepareStatement("update");
		PreparedStatement ps11=con.prepareStatement("update");
		PreparedStatement ps111=con.prepareStatement("insert");
		PreparedStatement ps1111=con.prepareStatement("insert");
		
		int count1=ps1111.executeUpdate();
		int count2=ps1111.executeUpdate();
		int count3=ps1111.executeUpdate();
		int count4=ps1111.executeUpdate();
		
		if(count1>0&&count2>0&&count3>0&&count4>0) {
			System.out.println("sucess");
		}else {
			System.out.println("fail");
		}
		
	}

}
