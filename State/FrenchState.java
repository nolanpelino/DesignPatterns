import java.util.ArrayList;
/**
 * @author npelino
 */
public class FrenchState implements State {
    private MusicBox musicBox;

    /**
     * Constructor
     * @param box A music box
     */
    public FrenchState(MusicBox box) {
        this.musicBox = box;
    }

     /**
     * Prints out French Twinkle Twinkle
     */
    public void pressStarButton() {
        ArrayList<String> twnk = new ArrayList<String>();
        twnk.add("Scintille, scintille, petite étoile");
        twnk.add("Comment je me demande ce que vous êtes");
        twnk.add("Au-dessus du monde si haut");
        twnk.add("Comme un diamant dans le ciel");
        twnk.add("Scintille, scintille, petite étoile");
        twnk.add("Comment je me demande ce que vous êtes");
        musicBox.playSong("Scintille, scintille, petite étoile", twnk);
    }

    /**
     * Prints out Fench Happy
     */
    public void pressHappyButton() {
        ArrayList<String> hppy = new ArrayList<String>();
        hppy.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        hppy.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        hppy.add("Si tu es content et que tu le sais");
        hppy.add("Et tu veux vraiment le montrer");
        hppy.add("Si tu es heureux et que tu le sais, tape dans tes mains");
        musicBox.playSong("Si tu es heureux et que tu le sais", hppy);
    }

    /**
     * Switches the Mode to English
     */
    public void pressEnglishButton() {
        System.out.println("Switching to English Mode");
        musicBox.setState(musicBox.getEnglishState());
    }

    /**
     * Lets the user know it's already in French
     */
    public void pressFrenchButton() {
        System.out.println("You are already in French mode");
    }

    /**
     * Switches the Mode to Spanish
     */
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish Mode");
        musicBox.setState(musicBox.getSpanishState());
    }
}
