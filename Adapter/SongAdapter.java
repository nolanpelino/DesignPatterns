public class SongAdapter extends Song {
    private Tune tune;

    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    public String getTitle() {
        String combo = tune.getDisplayTitle();
        String[] splat = combo.split(" : ");
        return splat[0];
    }

    public String getAlbum() {
        String combo = tune.getDisplayTitle();
        String[] splat = combo.split(" : ");
        return splat[1];
    }

    public String getArtistFirstName() {
        String combo = tune.getArtistName();
        String[] splat = combo.split("\\s+");
        return splat[0];
    }
    
    public String getArtistLastName() {
        String combo = tune.getArtistName();
        String[] splat = combo.split("\\s+");
        return splat[1];
    }

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
