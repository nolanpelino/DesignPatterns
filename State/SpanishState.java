import java.util.ArrayList;
/**
 * @author npelino
 */
public class SpanishState implements State{
    private MusicBox musicBox;
    
    /**
     * Constructor
     * @param box A music box
     */
    public SpanishState(MusicBox box) {
        this.musicBox = box;
    }

    /**
     * Prints out Spanish Twinkle Twinkle
     */
    public void pressStarButton() {
        ArrayList<String> twnk = new ArrayList<String>();
        twnk.add("Brilla brilla pequeña estrella");
        twnk.add("Cómo me pregunto lo que eres");
        twnk.add("Por encima del mundo tan arriba");
        twnk.add("Como un diamante en el cielo");
        twnk.add("Brilla brilla pequeña estrella");
        twnk.add("Cómo me pregunto lo que eres");
        musicBox.playSong("Brilla brilla pequeña estrella", twnk);
    }

    /**
     * Prints out Spanish Happy
     */
    public void pressHappyButton() {
        ArrayList<String> hppy = new ArrayList<String>();
        hppy.add("Si eres feliz y lo sabes aplaude");
        hppy.add("Si eres feliz y lo sabes aplaude");
        hppy.add("si estás contento y lo sabes");
        hppy.add("Y realmente quieres mostrarlo");
        hppy.add("Si eres feliz y lo sabes aplaude");
        musicBox.playSong("If You're Happy and You Know It", hppy);
    }

    /**
     * Switches the Mode to English
     */
    public void pressEnglishButton() {
        System.out.println("Switching to English Mode");
        musicBox.setState(musicBox.getEnglishState());
    }
    
    /**
     * Switches the Mode to French
     */
    public void pressFrenchButton() {
        System.out.println("Switching to French Mode");
        musicBox.setState(musicBox.getFrenchState());
    }

    /**
     * Lets the user know it's already in Spanish
     */
    public void pressSpanishButton() {
        System.out.println("You are already in Spanish Mode");
    }
}
