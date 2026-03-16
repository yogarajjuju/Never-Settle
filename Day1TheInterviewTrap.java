import java.util.Scanner;

public class Day1TheInterviewTrap {
    public static void main(String[] args) {
        // 1. The password saved in our database
        String savedPassword = "Anya";

        // 2. We use a Scanner to let the user type their password in the console
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        
        // This grabs what the user types and puts it in a new memory box
        String typedPassword = input.nextLine(); 

        // 3. THE TRAP: We check if they match using the beginner method
        // Challenge: Change this 'if' statement to use the professional String method instead!
        
        if (typedPassword.equals(savedPassword)) {
            System.out.println("Login Successful! Welcome back.");
        } else {
            System.out.println("Login Failed! The text matched, but they are different memory boxes.");
        }
        
        // Always close the scanner when you are done!
        input.close();
    }
}