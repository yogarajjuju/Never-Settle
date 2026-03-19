public class Day4Encapsulation {
    public static void main(String[] args) {
        User hacker = new User("HackerBoy", "hacker@darkweb.com", 19, true);

        // 1. If you tried to write hacker.email = "fake-email"; right now, 
        // Java would throw a massive red error because email is PRIVATE!

        // 2. Let's try to bypass the security using our Setter
        System.out.println("Attempting to set a bad email...");
        hacker.setEmail("not-a-real-email.com"); // Missing the @ symbol!

        System.out.println("\nAttempting to set a good email...");
        hacker.setEmail("legit@safe.com"); // This one should work!

        // Challenge: Use the Getter method to print out the hacker's final email!

        System.out.println("The final email in the database is: " +hacker.getEmail());
    }
}