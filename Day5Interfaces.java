import java.util.ArrayList; // Don't forget to import this!

public class Day5Interfaces {
    public static void main(String[] args) {
        
        // 1. Build our objects
        Song trackOne = new Song("Lose Yourself");
        Podcast epOne = new Podcast("Bleach Zangetsu Rain");
        Song trackTwo = new Song("Not Like Us");

        // 2. THE MAGIC: Create a Playlist that holds ANYTHING that signed the Contract!
        ArrayList<Playable> myPlaylist = new ArrayList<>();
        
        myPlaylist.add(trackOne);
        myPlaylist.add(epOne);
        myPlaylist.add(trackTwo);

        System.out.println("--- HITTING SHUFFLE ON THE PLAYLIST ---");

        // Challenge: Write a "for-each" loop to go through myPlaylist.
        // For every item in the list, tell it to .play()
        // ???
        for(Playable nums:myPlaylist){
            nums.play();
        }
    }
}