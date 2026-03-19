public class Day4OOP {
    public static void main(String[] args) {
        // 1. Building our custom Object
        // We use the 'new' keyword to tell Java to build a User from our blueprint
        User playerOne = new User();
        User playerTwo= new User();

        // 2. Filling in the data using "Dot Notation"
        playerOne.username = "Yogaraj";
        playerOne.email = "juju@backend.com";
        playerOne.age = 25; // Put your actual age here!
        playerOne.isOnline = true;

        // Challenge 1: Print out a profile summary for playerOne using the variables above.
        // It should look like: "User: Yogaraj | Email: juju@backend.com | Online: true"
        System.out.println("User: " + playerOne.username + " | Email: " + playerOne.email + " | Online: " + playerOne.isOnline);
        
        
        // Challenge 2: Build a second User object called 'playerTwo'. 
        // Give them a username, email, age, and make them offline (false).
        // ???
        playerTwo.username ="Anya";
        playerTwo.age=5;
        playerTwo.email="anya@gmail.com";
        playerTwo.isOnline=false;
        System.out.println("User: " + playerTwo.username + " | Email: " + playerTwo.email + " | Online: " + playerTwo.isOnline);
        

    }
}