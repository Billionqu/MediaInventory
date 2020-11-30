package UML_Polymorphism;

public class Item implements ItemInterface{
    public String comment;
    public boolean gotIt;
    public int playingTime;
    public String title;
    private final Enum<MediaType> type;
    private final String director;

    public Item(String title, String director, int playingTime, Enum<MediaType> type) {
        this.title = title;
        this.playingTime = playingTime;
        this.director = director;
        this.type = type;
    }

    public String getComment() {
        return comment;
    }

    public boolean getOwn() {
        return gotIt;
    }

    public void print() {
        System.out.print(
                type.toString() + ": " + title + " (" + playingTime + " mins) \n"
                        + "    " + director + "\n\n\n"
        );
    }

    public void setComment(String comment) {
        this.comment = comment;

    }

    public void setOwn(boolean gotIt) {
        this.gotIt = gotIt;
    }

    public String getType(){
        return type.toString();
    }
}
