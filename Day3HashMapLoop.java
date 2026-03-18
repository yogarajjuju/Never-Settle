import java.util.HashMap;

public class Day3HashMapLoop {
    public static void main(String[] args) {
        // Notice we are mixing data types: String for the Key (Name), Integer for the Value (Score)
        HashMap<String, Integer> playerScores = new HashMap<>();
        
        playerScores.put("Yogaraj", 50);
        playerScores.put("Anya", 100);

        // 1. THE OVERWRITE TRAP
        // Yogaraj just scored 25 more points. If we use the same Key, it updates the Value!
        playerScores.put("Yogaraj", 75);

        // Challenge 1: Print Yogaraj's score to prove it updated from 50 to 75.
        System.out.println("Yogaraj's new score is: " +playerScores.get("Yogaraj"));
        

        // 2. THE SENIOR DEVELOPER LOOP
        // You cannot loop through a HashMap normally because it has TWO pieces of data (Key and Value).
        // Instead, we use .keySet() to grab a list of just the Keys, and then pull the Values one by one.
        
        System.out.println("\n--- Live Scoreboard ---");
        
        for (String playerName : playerScores.keySet()) {
            // Challenge 2: Use the .get() method and the 'playerName' variable to grab their score!
            // int score = ???
            int score = playerScores.get(playerName);
            
            System.out.println(playerName + " : " + score);
        }
    }
}