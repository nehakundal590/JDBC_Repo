package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
    public static void main(String[] args) {

        try {
            // MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/shopping_app?useSSL=false&allowPublicKeyRetrieval=true",
                "root",
                "1234" // apna MySQL password
            );

            System.out.println("Connected Successfully ✅");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}