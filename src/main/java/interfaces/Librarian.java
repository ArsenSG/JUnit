package interfaces;

public interface Librarian extends Person {
    void ordersBooks(Supplier supplier, String bookName);
}