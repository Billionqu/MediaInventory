package UML_Polymorphism;

public class Video {
    public String comment;
    public boolean gotIt;
    public int playingTime;
    public String title;
    private Enum<VideoType> type;
    private String director;

    public Video(String title, String director,int playingTime, Enum<VideoType> type) {
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
