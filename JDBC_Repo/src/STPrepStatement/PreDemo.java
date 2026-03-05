package STPrepStatement;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreDemo {
    public static void main(String[] args) {
        try {
            // Load MySQL Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to DB
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3307/shopping_app", "root", "1234"
            );

            // Prepare statement
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO users (name, email, password, gender, city) VALUES (?, ?, ?, ?, ?)"
            );

            ps.setString(1, "seerat");
            ps.setString(2, "seerat@123");
            ps.setString(3, "Seerat123");
            ps.setString(4, "female");
            ps.setString(5, "delhi");

            // Execute
            int count = ps.executeUpdate();

            if (count > 0) {
                System.out.println("User inserted successfully");
            } else {
                System.out.println("User not registered due to some error");
            }

            // Close resources
            ps.close();
            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

