public class Podcast implements Playable{
   String title;

   public Podcast(String newTitle){
    this.title = newTitle;
   }

   @Override
   public void play(){
    System.out.println("▶️ PLAYING PODCAST: " + this.title);
   }
   @Override
   public void pause(){
     System.out.println("⏸️ PAUSED: " + this.title);
   }
}