package UML_Polymorphism;

public class CD extends Item {

    // Initialized the variable.
    private final String artist;
    private final int numberOfTracks;

    public CD (String title, String artist, int numberOfTracks, int playingTime) {
        super(title,artist,playingTime, MediaType.CD);
        this.artist = artist;
        this.numberOfTracks = numberOfTracks;
    }

    public String getArtist() {
        return artist;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    @Override
    public void print() {
        System.out.print(
                this.getClass().getSimpleName() + ": " + super.title + " (" + super.playingTime + " mins) \n"
                        + "    " + artist + "\n"
                        + "    " + "# tracks: " + numberOfTracks + "\n\n\n"
        );
    }

}