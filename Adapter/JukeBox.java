import java.util.HashMap;

public class JukeBox {
    private HashMap<String, Song> songs;
    private int currentSong;

    public JukeBox() {
        songs = new HashMap<String, Song>();
    }

    public void addSong(Song song) {
        songs.put(song.getTitle(), song);
    }

    public void play(String songName) {
        for (String name : songs.keySet()) {
            if (name == songName) {
                System.out.println(songs.get(name).toString());
                return;
            }
        }
        System.out.println("Song not found, sorry");
        return;
    }
}
