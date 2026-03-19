// "extends User" means Admin automatically gets EVERY variable and method from User!
public class Admin extends User {
    
    // The ONLY new thing we need to add:
    int adminLevel;

    // THE CONSTRUCTOR
    public Admin(String newUsername, String newEmail, int newAge, boolean newIsOnline, int newAdminLevel) {
        // 'super' means: "Hey Java, go up to the User class and use ITS constructor to set up the basic stuff"
        super(newUsername, newEmail, newAge, newIsOnline); 
        
        // Then we handle the new Admin-only stuff ourselves:
        this.adminLevel = newAdminLevel;
    }

    // A brand new method that only Admins have!
    public void banUser(String targetUser) {
        System.out.println("HAMMER DROPPED: Admin " + this.username + " just banned " + targetUser + "!");
    }
}