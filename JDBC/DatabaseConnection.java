import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement; // Importing the delivery truck

public class DatabaseConnection {
    public static void main(String[] args) {
        
        System.out.println("--- INITIATING DATABASE CONNECTION ---");

        String url = "jdbc:mysql://localhost:3306/discord_db";
        String user = "root";
        String password = "password123";

        try {
            System.out.println("Dialing the database...");
            Connection myConnection = DriverManager.getConnection(url, user, password);
            System.out.println("🟢 SUCCESS: The Bridge is open!");

            // 1. Create the delivery truck
            Statement myTruck = myConnection.createStatement();

            // 2. Tell the database to build a 'users' table if it doesn't have one yet
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(50), role VARCHAR(50));";
            myTruck.execute(createTableSQL);
            System.out.println("🟢 SUCCESS: 'users' table is ready.");

            // 3. Put a user in the truck and send it across the bridge!
            String insertUserSQL = "INSERT INTO users (username, role) VALUES ('yogarajjuju', 'Admin');";
            myTruck.executeUpdate(insertUserSQL);
            System.out.println("🟢 BOOM: User 'yogarajjuju' has been permanently saved to the vault!");

        } catch (Exception e) {
            System.out.println("🔴 ERROR: Something crashed.");
            e.printStackTrace(); 
        }
    }
}