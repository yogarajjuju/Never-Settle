public class Day4Constructors {
    public static void main(String[] args) {
        // Look at how clean this is! We build the entire object in ONE line of code.
        // We pass the data in the exact order the Constructor asked for it.
        User playerOne = new User("Yogaraj", "juju@backend.com", 25, true);

        // Challenge 1: Build playerTwo (Anya) using this same exact one-line Constructor!
        // User playerTwo = ???
        User playerTwo = new User("Anya", "anya@frontend.com",6,true);

        // Challenge 2: Print out Anya's email to prove she was built correctly.
        System.out.println("Anya's email is: " + playerTwo.email);
    }
}