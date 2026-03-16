public class day1String {
    public static void main(String[] args) {
        // 1. The Raw Data
        String fullName = "Yogaraj S";
        
        // 2. The Challenge: Split the name into two separate variables
        // Hint: Look up the .split() method in Java
       String[] Split= fullName.split(" ");
        
        // String firstName = ???
        // String lastName = ???
        String firstName = Split[0];
        String lastName =Split[1];

        // 3. Print the results
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        
        // Bonus Challenge: Print the length of the first name using .length()
    }
}