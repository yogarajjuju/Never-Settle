public class Day4Inheritance {
    public static void main(String[] args) {
        // 1. Let's build a standard User
        User basicJuju = new User("StandardJuju", "juju@pleb.com", 25, true);
        
        // 2. Now let's build the God-Tier Admin!
        // Notice we pass in the 4 User variables, PLUS the new Admin Level (99) at the end.
        Admin godJuju = new Admin("SuperJuju", "admin@server.com", 25, true, 99);

        // Challenge 1: Even though we didn't write a getEmail() method inside the Admin.java file, 
        // godJuju INHERITED it from User! 
        // Prove it by printing out godJuju's email using the .getEmail() getter.
        System.out.println("The Admin's secure email is: " + godJuju.getEmail());

        // Challenge 2: basicJuju has been acting up. Use godJuju's special Admin power to ban him!
        // Hint: You need to call the banUser() method and pass in basicJuju's username.
        // ???
        godJuju.banUser("StandardJuju");
    }
}