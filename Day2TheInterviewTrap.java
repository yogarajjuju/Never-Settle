import java.util.ArrayList;

public class Day2TheInterviewTrap {
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>();
        users.add("Yogaraj");
        users.add("Anya");
        users.add("Hacker"); // We want to remove this guy
        users.add("Ferdin");

        // THE TRAP: Trying to remove an item while inside an Enhanced For-Loop
        // If you run this, it will throw a massive red error!
        
        /* for (String user : users) {
            if (user.equals("Hacker")) {
                users.remove(user); // CRASH!
            }
        }
        */

        // YOUR MISSION: 
        // How do you safely remove "Hacker" from the list WITHOUT crashing the app?
        // Hint: You can use a standard old-school 'for' loop with an index (int i = 0...), 
        // OR you can look up the modern Senior Developer shortcut: .removeIf()
        
        // Write your safe removal code here:
        // ???
        // for(int i=0;i<users.size();i++){
        //     if(users.get(i).equals("Hacker")){
        //         users.remove(i);
        //     }
        // }
        users.removeIf(user-> user.equals("Hacker"));

        System.out.println("Clean User List: " + users);
    }
} 