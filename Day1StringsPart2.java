public class Day1StringsPart2 {
    public static void main(String[] args) {
        // The Raw, Messy Data from a user
        String rawEmail = "   Yogaraj.S@Gmail.com   ";
        String rawPhone = "123-456-7890";

        // Challenge 1: Remove the invisible spaces at the start and end of the email.
        String step1Email = rawEmail.trim();
        

        // Challenge 2: Convert that trimmed email into all lowercase letters.
        // String finalEmail = rawEmail.toLowerCase();
        String finalEmail = rawEmail.trim().toLowerCase();

        // Challenge 3: Remove the dashes from the phone number so it's just pure numbers.
        // Hint: You want to replace "-" with "" (an empty string).
        String finalPhone =rawPhone.replace("-", "");

        // Challenge 4: Check if the finalEmail ends with "@gmail.com". 
        // This will output 'true' or 'false'.
         boolean isValidDomain = finalEmail.endsWith("@gmail.com");

        // Print the final cleaned data to prove it works!
        System.out.println("Clean Email: *" + finalEmail + "*");
        System.out.println("Clean Phone: " + finalPhone);
        System.out.println("Is a Gmail account: " + isValidDomain);
    }
}