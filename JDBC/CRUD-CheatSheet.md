import java.sql.*;

public class DatabaseManager {

    // ==========================================
    // 1. C - CREATE (Insert Data)
    // ==========================================
    public static void createUser(Connection conn, String username, String role) {
        try {
            Statement stmt = conn.createStatement();
            // Using variables passed into the method to make it reusable
            String sql = "INSERT INTO users (username, role) VALUES ('" + username + "', '" + role + "');";
            int rows = stmt.executeUpdate(sql);
            System.out.println("✅ " + rows + " user(s) created: " + username);
        } catch (SQLException e) {
            System.out.println("🔴 Failed to create user.");
            e.printStackTrace();
        }
    }

    // ==========================================
    // 2. R - READ (Fetch Data)
    // ==========================================
    public static void readUsers(Connection conn) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM users;";
            ResultSet rs = stmt.executeQuery(sql);

            System.out.println("---- Current Users in Database ----");
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String role = rs.getString("role");
                System.out.println("🆔 " + id + " | 👤 " + username + " | 🛡️ " + role);
            }
            System.out.println("-----------------------------------");
        } catch (SQLException e) {
            System.out.println("🔴 Failed to fetch users.");
            e.printStackTrace();
        }
    }

    // ==========================================
    // 3. U - UPDATE (Modify Data)
    // ==========================================
    public static void updateUserRole(Connection conn, int targetId, String newRole) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "UPDATE users SET role = '" + newRole + "' WHERE id = " + targetId + ";";
            int rows = stmt.executeUpdate(sql);
            System.out.println("✨ " + rows + " user(s) updated to role: " + newRole);
        } catch (SQLException e) {
            System.out.println("🔴 Failed to update user.");
            e.printStackTrace();
        }
    }

    // ==========================================
    // 4. D - DELETE (Remove Data)
    // ==========================================
    public static void deleteUser(Connection conn, int targetId) {
        try {
            Statement stmt = conn.createStatement();
            String sql = "DELETE FROM users WHERE id = " + targetId + ";";
            int rows = stmt.executeUpdate(sql);
            System.out.println("🗑️ " + rows + " user(s) deleted!");
        } catch (SQLException e) {
            System.out.println("🔴 Failed to delete user.");
            e.printStackTrace();
        }
    }

    // ==========================================
    // MAIN METHOD (The Control Center)
    // ==========================================
    public static void main(String[] args) {
        // Database credentials
        String url = "jdbc:mysql://localhost:3306/discord_db";
        String user = "root";
        String password = "password123";

        try {
            // 1. Open the vault connection once
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("🟢 Vault Opened Successfully!");

            // 2. Use your tools! (Uncomment to test)
            
            // createUser(conn, "LoidForger", "Spy");
            // updateUserRole(conn, 2, "Super Admin");
            // deleteUser(conn, 3);
            
            // Always read at the end to see the final state
            readUsers(conn); 

        } catch (Exception e) {
            System.out.println("🔴 Vault Locked: Connection Failed.");
            e.printStackTrace();
        }
    }
}