package UML_Polymorphism;

import java.util.ArrayList;

public class Database{

    //Create Item list as mock database
    private final ArrayList<Item> items;

    public Database(ArrayList<Item> _items) {
        this.items = _items;
    }

    //Add items to the list
    public void addItem(Item Item) {
        items.add(Item);
    }

    //List all items by printing them all in console
    public void list() {
        for(Item item:items)
            item.print();
    }

    //Search for specified types of medias
    public void search(Enum<MediaType> type){
        for (Item item: items) {
            if(item.getType().equals(type.toString())){
                item.print();
            }
        }
    }
    
    //Search for medias include the specified string in their title
    public void search(String str){
        for (Item item: items) {
            if(item.title.contains(str)){
                item.print();
            }
        }
    }

}