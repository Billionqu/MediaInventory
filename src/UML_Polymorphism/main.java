package UML_Polymorphism;

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        Database db = new Database(new ArrayList<>());

        //Adding videos using individual class
        db.addItem(new CD("A Swingin' Affair", "Frank Sinatra", 16, 64));
        db.addItem(new DVD("Big Bad World", "Plain White T's", 10));

        //Adding videos using generic item class
        db.addItem(new Item("O Brother, Where Art You?", "Joel & Ethon Coen",106, MediaType.CD));
        db.addItem(new Item("O Brother, Where Art You?", "Joel & Ethon Coen",106, MediaType.DVD));
        db.addItem(new Item("Infinity Wars", "Anthony & Joe Russo",149, MediaType.Bluray));

        //Adding audio using generic item class
        db.addItem(new Item("Dangerous", "Michael Jackson", 4, MediaType.Mp3));

        db.list();

        db.search("O Brother");
        db.search(MediaType.Bluray);
    }
}
