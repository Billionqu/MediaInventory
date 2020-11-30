package UML_Polymorphism;

import java.util.ArrayList;

enum VideoType{
    CD, DVD, Bluray
}

public class Database{

    // Initialized the variable
    private ArrayList<Video> items=new ArrayList<Video>();

    public Database() { //Set the constructor
    }

    // add items into the ArrayList
    public void addItem(Video Item) {
        items.add(Item);
    }

    //print all the items
    public void list() {
        for(Video item:items)
            item.print();
    }

    //Search for specified types of videos
    public void search(Enum<VideoType> type){
        for (Video item: items) {
            if(item.getType().toString() == type.toString()){
                item.print();
            }
        }
    }
    
    //Search for videos includes the specified string in their title
    public void search(String str){
        for (Video item: items) {
            if(item.title.contains(str)){
                item.print();
            }
        }
    }

    //Tester
    public static void main(String[] args) {
        Database db = new Database();
        CD c = new CD("A Swingin' Affair", "Frank Sinatra", 16, 64);
        CD d = new CD("Big Bad World", "Plain White T's", 10, 35);
        Video x = new Video("O Brother, Where Art You?", "Joel & Ethon Coen",106, VideoType.Bluray);
        Video y = new Video("O Brother, Where Art You?", "Joel & Ethon Coen",106, VideoType.DVD);
        Video z = new Video("Infinity Wars", "Anthony & Joe Russo",149, VideoType.Bluray);

        db.addItem(c);
        db.addItem(d);
        db.addItem(x);
        db.addItem(y);
        db.addItem(z);

        db.list();

        db.search("O Brother");
        db.search(VideoType.Bluray);
    }

}