import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static void main(String[] args) {
        
        System.out.println("--- INITIATING DATABASE CONNECTION ---");

        // 1. The Database URL (localhost means 'this computer', 3306 is the standard MySQL port)
        String url = "jdbc:mysql://localhost:3306/discord_db";
        
        // 2. Credentials (In Codespaces, the default admin is 'root' with a blank password)
        String user = "root";
        String password = "password123";

        // 3. The Blast Shield
        try {
            System.out.println("Dialing the database...");
            Connection myConnection = DriverManager.getConnection(url, user, password);
            System.out.println("🟢 SUCCESS: The Bridge is open! Java is officially connected to MySQL.");
            
        } catch (Exception e) {
            System.out.println("🔴 ERROR: Connection failed.");
            e.printStackTrace(); // This prints the exact reason why it failed
        }
    }
}