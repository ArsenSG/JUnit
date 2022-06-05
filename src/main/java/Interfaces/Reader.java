package Interfaces;

public interface Reader extends Person {
    void tookTheBook(String bookName);
    void returnedTheBook(Administrator administrator);
}