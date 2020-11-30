package UML_Polymorphism;

public interface ItemInterface {
    String getComment();
    boolean getOwn();
    void print();
    void setComment(String comment);
    void setOwn(boolean gotIt);
    String getType();
}
