import java.util.ArrayList;
/**
 * @author npelino
 */
public class EnglishState implements State {
    private MusicBox musicBox;

    /**
     * Constructor
     * @param box A music box
     */
    public EnglishState(MusicBox box) {
        this.musicBox = box;
    }

    /**
     * Prints out English Twinkle Twinkle
     */
    public void pressStarButton() {
        ArrayList<String> twnk = new ArrayList<String>();
        twnk.add("Twinkle, twinkle, little star");
        twnk.add("How I wonder what you are");
        twnk.add("Up above the world so high");
        twnk.add("Like a diamond in the sky");
        twnk.add("Twinkle, twinkle, little star");
        twnk.add("How I wonder what you are");
        musicBox.playSong("Twinkle, Twinkle Little Star", twnk);
    }

    /**
     * Prints out English Happy
     */
    public void pressHappyButton() {
        ArrayList<String> hppy = new ArrayList<String>();
        hppy.add("If you're happy and you know it clap your hands");
        hppy.add("If you're happy and you know it clap your hands");
        hppy.add("If you're happy and you know it");
        hppy.add("And you really want to show it");
        hppy.add("If you're happy and you know it clap your hands");
        musicBox.playSong("If You're Happy and You Know It", hppy);
    }

    /**
     * Lets the user know it's already in English
     */
    public void pressEnglishButton() {
        System.out.println("You are already in English mode");
    }
    
    /**
     * Switches the Mode to French
     */
    public void pressFrenchButton() {
        System.out.println("Switching to French Mode");
        musicBox.setState(musicBox.getFrenchState());
    }

    /**
     * Switches the Mode to Spanish
     */
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish Mode");
        musicBox.setState(musicBox.getSpanishState());
    }
}