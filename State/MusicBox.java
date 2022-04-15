import java.util.ArrayList;
import java.lang.Thread;
/**
 * @author npelino
 */
public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Constructor. Sets all states
     */
    public MusicBox() {
        englishState = new EnglishState(this);
        frenchState = new FrenchState(this);
        spanishState = new SpanishState(this);
        state = englishState;
    }

    /**
     * Plays Twinkle, Twinkle Little Star in the State's Language
     */
    public void pressStarButton() {
        state.pressStarButton();
    }

    /**
     * Plays Happy if You know It in the State's Language
     */
    public void pressHappyButton() {
        state.pressHappyButton();
    }

    /**
     * Switches State to English
     */
    public void pressEnglishButton() {
        this.state.pressEnglishButton();
    }
    
    /**
     * Switches State to French
     */
    public void pressFrenchButton() {
        this.state.pressFrenchButton();
    }

    /**
     * Switches State to Spanish
     */
    public void pressSpanishButton() {
        this.state.pressSpanishButton();
    }

    /**
     * Method used to change the current State
     * @param state is the deired state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * @return the MusicBox's English State
     */
    public State getEnglishState() {
        return this.englishState;
    }

    /**
     * @return the MusicBox's French State
     */
    public State getFrenchState() {
        return this.frenchState;
    }

    /**
     * @return the MusicBox's Spanish State
     */
    public State getSpanishState() {
        return this.spanishState;
    }

    /**
     * Prints out the parameterized song
     * @param songName is the name of the song
     * @param lyrics the ArrayList of lyrics
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("Playing: " + songName);
        for (String line : lyrics) {
            System.out.println(line);
            try {
                Thread.sleep(150);
            } catch(InterruptedException e) {
                System.out.println("Got interrupted!");
            }
        }
    }
}
