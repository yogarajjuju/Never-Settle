import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("----Initating Database connection----");
        String url = "jdbc:mysql://localhost:3306/discord_db";
        String user = "root";
        String password = "password123";
        
        try {
            System.out.println("Dailing the database...");
            Connection myConnection = DriverManager.getConnection(url, user, password);
            Statement myTruck = myConnection.createStatement();

            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(50), role VARCHAR(50));";
            myTruck.execute(createTableSQL);
            System.out.println("🟢 SUCCESS: 'users' table is ready.");

            String insertUserSQL = "Insert into users (username, role ) Values ('anyaforger', 'Admin');";
            myTruck.executeUpdate(insertUserSQL);
            System.out.println("🟢 BOOM: User 'anyaforger' has been permanently saved to the vault!");

            // --- WE MOVED THIS INSIDE THE TRY BLOCK! ---
            System.out.println("---- Fetching Users from Vault ----");
            String query = "SELECT * FROM users;";
            
            // We can actually just reuse your 'myTruck' statement instead of making a new one!
            ResultSet resultSet = myTruck.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id"); 
                String username = resultSet.getString("username");
                System.out.println("🆔 ID: " + id + " | 👤 User: " + username);
            }
            System.out.println("✅ Fetch complete!");
            // -------------------------------------------

        } catch(Exception e) {
            System.out.println("🔴 ERROR: Something crashed.");
            e.printStackTrace();
        }
    }
}