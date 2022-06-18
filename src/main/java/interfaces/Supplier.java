package interfaces;

public interface Supplier extends Person {
    void bookShipment(Librarian librarian, String bookName);
}