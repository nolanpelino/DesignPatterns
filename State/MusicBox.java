public class MusicBox {
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    public MusicBox() {
        //TODO
    }

    public void pressStarButton() {

    }

    public void pressHappyButton() {

    }

    public void pressEnglishButton() {

    }
    
    public void pressFrenchButton() {

    }

    public void pressSpanishButton() {

    }

    public void setState(State state) {
        this.state = state;
    }

    public State getEnglishState() {
        return this.englishState;
    }

    public State getFrenchState() {
        return this.frenchState;
    }

    public State getSpanishState() {
        return this.spanishState;
    }

    public void playSong(String songName, ArrayList<String> lyrics) {
        
    }
}
