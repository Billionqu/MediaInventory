package UML_Polymorphism;

public class DVD extends Item {

    private final String director;


    public DVD (String title, String director,int playingTime) {
        super(title,director,playingTime, MediaType.DVD);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void print() {
        System.out.print(
                this.getClass().getSimpleName() + ": " + super.title + " (" + super.playingTime + " mins) \n"
                        + "    " + director + "\n\n\n"
        );
    }


}