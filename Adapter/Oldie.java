    /**
     * @author npelino
     */
public class Oldie implements Tune {
    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    
    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    /**
     * Returns the artists name, First and Last
     */
    public String getArtistName() {
        return artistName;
    }

    /**
     * Displays the song title and its album seperated by a ":"
     */
    public String getDisplayTitle() {
        return songTitle + " : " + recordTitle;
    }

    /**
     * Returns the category of the Oldie
     */
    public String getCategory() {
        return this.category;
    }
}
