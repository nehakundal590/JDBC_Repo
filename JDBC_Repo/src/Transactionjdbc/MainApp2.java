/*-package Transactionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainApp2 {
	Connection con=null;
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3307/shopping_app","root","1234");
			con.setAutoCommit(false);
			Statement st1=con.createStatement();
		int count1=	st1.executeUpdate("insert into items values(101,'jeans',999)");
		int count2=	st1.executeUpdate("insert into items values(102,'shirt',899)");
		int count3=	st1.executeUpdate("insert into items values(103,'top',799)");
		if(count1>0&&count2>0&&count3>0) {
			con.commit();
			System.out.println("sucess");
		}
		}
		catch(Exception e) {
			try {
				con.rollback();
			}
			catch(SQL Exception ee) {
			ee.printStackTrace();
			}
		}
	}

}*/
package Transactionjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class MainApp2 {

    static Connection con = null;

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/shopping_app",
                    "root",
                    "1234");

            con.setAutoCommit(false);

            Statement st1 = con.createStatement();

            int count1 = st1.executeUpdate("insert into items values(101,'jeans',999)");
            int count2 = st1.executeUpdate("insert into items values(102,'shirt',899)");
            int count3 = st1.executeUpdate("insert into items values(103,'top',799)");

            if (count1 > 0 && count2 > 0 && count3 > 0) {
                con.commit();
                System.out.println("Success");
            }

        } 
        catch (Exception e) {

            try {
                con.rollback();
                System.out.println("Transaction Rolled Back");
            } 
            catch (SQLException ee) {
                ee.printStackTrace();
            }

        }

    }
}