package Interfaces;

public interface Administrator extends Person{
    void overdueNotification(Reader reader);
    void giveBook(String bookName, Reader reader);
}