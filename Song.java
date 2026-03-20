// "implements Playable" means Song is legally signing the contract
public class Song implements Playable {
    
    String title;

    // A quick Constructor so we can name our song
    public Song(String newTitle) {
        this.title = newTitle;
    }

    // RULE 1: We MUST write the play() method, or Java will throw a massive red error.
    // The @Override tag just tells Java, "Hey, I'm fulfilling that contract rule right now."
    @Override
    public void play() {
        System.out.println("▶️ PLAYING MUSIC: " + this.title);
    }

    // RULE 2: We MUST write the pause() method.
    @Override
    public void pause() {
        System.out.println("⏸️ PAUSED: " + this.title);
    }
}