import interfaces.Administrator;
import interfaces.Librarian;
import interfaces.Reader;
import interfaces.Supplier;

public class ClassAdmin extends User implements Administrator, Librarian {
    ClassAdmin(String name, String role) {
        super(name, role);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(this.sayRole() + " " + this.sayName() + " сделала замечание " + reader.sayRole() + " " + reader.sayName() + " за задержку книги");
    }

    @Override
    public void giveBook(String bookName, Reader reader) {
        System.out.println(this.sayRole() + " " + this.sayName() + " выдала книгу " + bookName + " " + reader.sayRole() + " " + reader.sayName());
    }

    @Override
    public String sayName() {
        return getName();
    }

    @Override
    public String sayRole() {
        return getRole();
    }

    @Override
    public void ordersBooks( Supplier supplier, String bookName) {
        System.out.println("Пока библиотекарь болеет, " + this.sayRole() + " " + this.sayName() + " решила заказать у " + supplier.sayRole() + " " + supplier.sayName() + " новую книгу " + bookName);
    }
}