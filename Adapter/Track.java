    /**
     * @author npelino
     */
public class Track extends Song {
    private String title;
    private String album;
    private String firstName;
    private String lastName;
    private Genre genre;

    /**
     * Constructor for the Track Object
     * @param title
     * @param album
     * @param firstName
     * @param lastName
     * @param genre
     */
    public Track(String title, String album, String firstName, String lastName, Genre genre) {
        this.title = title;
        this.album = album;
        this.firstName = firstName;
        this.lastName = lastName;
        this.genre = genre;
    }

    /**
     * Returns the title of the Track
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Returns the album name of the Track
     */
    public String getAlbum() {
        return this.album;
    }

    /**
     * Returns the Track's author's first name
     */
    public String getArtistFirstName() {
        return this.firstName;
    }

    /**
     * Returns the Track's author's last name
     */
    public String getArtistLastName() {
        return this.lastName;
    }

    /**
     * Returns the Track's genre
     */
    public String getGenre() {
        return this.genre.toString();
    }
}
