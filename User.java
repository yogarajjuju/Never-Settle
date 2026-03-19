public class User {
    String username;
    private String email; // Notice the word 'private'! It is now LOCKED.
    int age;
    boolean isOnline;

    public User(String newUsername, String newEmail, int newAge, boolean newIsOnline) {
        this.username = newUsername;
        this.email = newEmail;
        this.age = newAge;
        this.isOnline = newIsOnline;
    }

    // THE GETTER: The only way to READ the private email
    public String getEmail() {
        return this.email;
    }

    // THE SETTER: The only way to CHANGE the private email
    public void setEmail(String newEmail) {
        // The Bouncer Logic: Only allow the change if it actually looks like an email
        if (newEmail.contains("@")) {
            this.email = newEmail;
        } else {
            System.out.println("SECURITY ALERT: Invalid email format rejected!");
        }
    }
}