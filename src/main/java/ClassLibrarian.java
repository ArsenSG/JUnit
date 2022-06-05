import Interfaces.Administrator;
import Interfaces.Librarian;
import Interfaces.Reader;
import Interfaces.Supplier;

public class ClassLibrarian extends User implements Librarian, Administrator {
    public ClassLibrarian(String name, String role) {
        super(name, role);
    }

    @Override
    public void ordersBooks(Supplier supplier, String bookName) {
        System.out.println(this.sayRole() + " " + this.sayName() + " заказала книгу у " + supplier.sayRole() + " " + supplier.sayName());
    }

    @Override
    public String sayName() {
        return name;
    }

    @Override
    public String sayRole() {
        return role;
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(this.sayRole() + " " + this.sayName() + " в отсутствие администратора сделала замечание за задержку книги " + reader.sayRole() + " " + reader.sayName());
    }

    @Override
    public void giveBook(String bookName, Reader reader) {
        System.out.println("Пока администратор отлучилась в туалет, " + this.sayRole() + " " + this.sayName() + " выдала книгу " + bookName + " " + reader.sayRole() + " " + reader.sayName());
    }
}