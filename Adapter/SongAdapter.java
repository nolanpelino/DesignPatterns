    /**
     * @author npelino
     */
public class SongAdapter extends Song {
    private Tune tune;

    /**
     * SongAdapter converts a Tune into a Song
     * @param tune The tune being converted
     */
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    /**
     * Returns the song title
     */
    public String getTitle() {
        String combo = tune.getDisplayTitle();
        String[] splat = combo.split(" : ");
        return splat[0];
    }

    /**
     * Returns the Album name
     */
    public String getAlbum() {
        String combo = tune.getDisplayTitle();
        String[] splat = combo.split(" : ");
        return splat[1];
    }

    /**
     * Returns the Artist's first name
     */
    public String getArtistFirstName() {
        String combo = tune.getArtistName();
        String[] splat = combo.split("\\s+");
        return splat[0];
    }
    
    /**
     * Returns the Artist's last name
     */
    public String getArtistLastName() {
        String combo = tune.getArtistName();
        String[] splat = combo.split("\\s+");
        return splat[1];
    }

    /**
     * Returns a converted genre found in the Genre enum
     */
    public String getGenre() {
        if (tune.getCategory().equalsIgnoreCase("Country and Western"))
            return Genre.COUNTRY.toString();
        else if (tune.getCategory().equalsIgnoreCase("R&B and Soul"))
            return Genre.HIPHOP.toString();
        else if (tune.getCategory().equalsIgnoreCase("Easy Listening"))
            return Genre.JAZZ.toString();
        else 
            return Genre.ROCK.toString();

    }
}
