import java.util.HashMap;

public class Day3HashMaps {
    public static void main(String[] args) {
        // 1. Creating the HashMap
        // Notice we have to declare TWO types of data: <The Key, The Value>
        HashMap<String, String> userDatabase = new HashMap<>();

        // 2. Adding data using .put(Key, Value)
        userDatabase.put("ID-001", "Yogaraj");
        userDatabase.put("ID-002", "Anya");
        userDatabase.put("ID-003", "Ferdin");

        // Challenge 1: Add yourself! Make a new ID (like "ID-004") and put your username as the value.
        // ???
        userDatabase.put("ID-004" , "Vasteppen");

        // 3. Retrieving data using .get(Key)
        // Instead of giving it an index number like 0 or 1, you give it the exact Key!
        String targetUser = userDatabase.get("ID-002");
        System.out.println("User ID-002 belongs to: " + targetUser);

        // Challenge 2: Pull YOUR username out of the database using the ID you just created, 
        // and print it to the console!
        // String myUser = ???
        // System.out.println("My user is: " + ???);
        String myUser =userDatabase.get("ID-001");
        System.out.println("User ID-001 belongs to: "+myUser );
        
        // 4. Checking if a Key exists (The Bouncer)
        // This answers True/False: Does "ID-999" exist in our database?
        boolean exists = userDatabase.containsKey("ID-999");
        System.out.println("Does ID-999 exist? " + exists);
        boolean isthere =userDatabase.containsKey("ID-001");
        System.out.println("Does ID-001 exist? "+ isthere);
    }
}