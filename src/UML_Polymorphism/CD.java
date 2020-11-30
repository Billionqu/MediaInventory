package UML_Polymorphism;

public class CD extends Video{

    // Initialized the variable.
    private String artist;
    private int numberOfTracks;

    public CD (String title, String artist, int numberOfTracks, int playingTime) {
        super(title,artist,playingTime,VideoType.CD);
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
    }

    public String getArtist() {
        return artist;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    public void print() {
        System.out.print(
                this.getClass().getSimpleName() + ": " + super.title + " (" + super.playingTime + " mins) \n"
                        + "    " + artist + "\n"
                        + "    " + "# tracks: " + numberOfTracks + "\n\n\n"
        );
    }

}