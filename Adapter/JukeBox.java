import java.util.HashMap;
/**
 * @author npelino
 */
public class JukeBox {
    private HashMap<String, Song> songs;
    private int currentSong;

    /**
     * Jukebox Constructor
     */
    public JukeBox() {
        songs = new HashMap<String, Song>();
    }

    /**
     * Adds a song to the JukeBox's ArrayList
     * @param song of the users choice
     */
    public void addSong(Song song) {
        songs.put(song.getTitle(), song);
    }

    /**
     * Plays a song if it is held in the JukeBox
     * @param songName Song being searched for
     */
    public void play(String songName) {
        for (String name : songs.keySet()) {
            if (songName.equalsIgnoreCase(name)) {
                System.out.println(songs.get(name).toString());
                return;
            }
        }
        System.out.println("Song not found, sorry");
        return;
    }
}
