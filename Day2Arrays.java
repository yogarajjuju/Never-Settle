public class Day2Arrays {
    public static void main(String[] args) {
        // 1. Creating an Array of Strings
        // Notice the curly braces {}! This tells Java we are making a list.
        String[] topAnime = {"Spy x Family", "Jujutsu Kaisen", "Attack on Titan", "Death Note"};

        // 2. Accessing data
        // Remember from yesterday: Java ALWAYS starts counting at 0!
        
        // Challenge 1: Print "Spy x Family" to the console.
        System.out.println(topAnime[0]);

        // Challenge 2: Print "Death Note" to the console.
        System.out.println(topAnime[3]);

        // 3. Finding the size of the array
        // Hint: For Strings we used .length(), but for Arrays we just use .length (NO parentheses!)
        // Challenge 3: Print the total number of shows in this list.
        System.out.println("Total shows: " + topAnime.length);
    }
}