package ResultSetDemo;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main2 {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/shopping_app","root","1234");
		PreparedStatement ps=con.prepareStatement("select*from user");
		ResultSet rs=ps.executeQuery();
		//it will move the  resultSet cursor one by one to each row
		while(rs.next());
		//it will move the  resultSet cursor to the next row(first row)
		rs.next();
		//rs.first();
		//rs.next();
		//rs.next();
		//it will move the  resultSet cursor to first row and the second row
		
			String myname=rs.getString("name");
			String myemail=rs.getString("email");
			System.out.println("name"+myname);
			System.out.println(myname+"-"+myemail+"-");
		
		rs.close();
		ps.close();
		con.close();
	}

}
