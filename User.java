public class User {
    // 1. The Attributes
    String username;
    String email;
    int age;
    boolean isOnline;

    // 2. THE CONSTRUCTOR
    // Notice it has the exact same name as the class (User)
    public User(String newUsername, String newEmail, int newAge, boolean newIsOnline) {
        // We take the data handed to us, and lock it into the Object's variables
        this.username = newUsername; 
        this.email = newEmail;
        this.age = newAge;
        this.isOnline = newIsOnline;
    }
}