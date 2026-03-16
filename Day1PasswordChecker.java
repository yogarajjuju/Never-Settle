public class Day1PasswordChecker {
    public static void main(String[] args) {
        // Change this string to test different passwords!
        String newPassword = "AnyaForger@2026"; 
        String username = "juju";

        // Rule 1: Check if the password is 8 or more characters long
        // Hint: use .length() >= 8
        boolean isLongEnough=false;
        if (newPassword.length()>=8){
             isLongEnough =true;


        }

        // Rule 2: Check if it contains an "@" symbol
        // Hint: use .contains()
         boolean hasSpecialChar=false;
        if(newPassword.contains("@")){
         hasSpecialChar=true;
        }
        // boolean hasSpecialChar = ???

        // Rule 3: Check that the password is NOT the exact same as the username
        // Hint: In Java, putting an exclamation mark (!) in front of a boolean flips it to "NOT". 
        // Example: !newPassword.equals(username)
        boolean isNotUsername=true;
        if(!newPassword.equals(username)){
            isNotUsername=false;
        }
        // boolean isNotUsername = ???

        // Print the security report
        System.out.println("Password tested: " + newPassword);
        System.out.println("Passes length test: " + isLongEnough);
        System.out.println("Passes special char test: " + hasSpecialChar);
        System.out.println("Passes username test: " + isNotUsername);
    }
}