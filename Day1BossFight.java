public class Day1BossFight {
    public static void main(String[] args) {
        String userEmail = "hackerjuju@gmail.com";

        // Challenge 1: Find the exact position (index) of the "@" symbol.
        int atSymbolPosition = userEmail.indexOf("@");

        // Challenge 2: Use .substring() to slice out JUST the username.
        // Hint: You want to start at index 0, and stop at the atSymbolPosition!
         String username = userEmail.substring(0,10);

        // Challenge 3: Get the very first letter of the username using .charAt()
         char firstLetter = username.charAt(0);

        // Print the final results!
        System.out.println("The @ symbol is at position: " + atSymbolPosition);
        System.out.println("Extracted Username: " + username);
        System.out.println("First Letter: " + firstLetter);
    }
}