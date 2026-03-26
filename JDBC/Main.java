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

            // --- NEW: THE UPDATE COMMAND ---
            System.out.println("---- Upgrading Anya's Role (ID 2) ----");
            String updateSQL = "UPDATE users SET role = 'Super Admin' WHERE id = 2;";
            int rowsUpdated = myTruck.executeUpdate(updateSQL);
            System.out.println("✨ " + rowsUpdated + " user(s) upgraded!");

            // --- FETCHING THE RESULTS ---
            System.out.println("---- Fetching Users from Vault ----");
            String query = "SELECT * FROM users;";
            ResultSet resultSet = myTruck.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id"); 
                String username = resultSet.getString("username");
                String role = resultSet.getString("role"); // Grabbing the role to prove it changed!
                System.out.println("🆔 ID: " + id + " | 👤 User: " + username + " | 🛡️ Role: " + role);
            }
            System.out.println("✅ Fetch complete!");

        } catch(Exception e) {
            System.out.println("🔴 ERROR: Something crashed.");
            e.printStackTrace();
        }
    }
}