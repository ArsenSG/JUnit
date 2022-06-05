public class Main {
    public static void main(String[] args) {
        ClassReader vasya = new ClassReader("Вася", "Читатель");
        ClassAdmin vasilisa = new ClassAdmin("Василиса", "Администратор");
        ClassLibrarian janna = new ClassLibrarian("Жанна", "Библиотекарь");
        ClassSupplier petya = new ClassSupplier("Пётр", "Поставщик");

        Book vlastelin = new Book("Властелин колец");
        Book vim = new Book("Война и мир");
        Book grok = new Book("Грокаем алгоритмы");
        Book stolet = new Book("Сто лет одиночества");

        vasya.tookTheBook(vlastelin.getBookName());
        vasilisa.overdueNotification(vasya);
        vasya.returnedTheBook(vasilisa);
        System.out.println();

        petya.tookTheBook(grok.getBookName());
        vasilisa.giveBook(grok.getBookName(), petya);
        petya.returnedTheBook(vasilisa);
        System.out.println();

        janna.giveBook(vim.getBookName(), vasya);
        vasilisa.ordersBooks(petya, stolet.getBookName());
        petya.bookShipment(vasilisa, stolet.getBookName());
    }
}