import Interfaces.Administrator;
import Interfaces.Librarian;
import Interfaces.Reader;
import Interfaces.Supplier;

public class ClassSupplier extends User implements Supplier, Reader {
    public ClassSupplier(String name, String role) {
        super(name, role);
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
    public void bookShipment(Librarian librarian, String bookName) {
        System.out.println("По заказу " + librarian.sayRole() + " " + librarian.sayName() + " " + this.sayRole() + " " + this.sayName() + " привез в библиотеку новую книгу " + bookName);
    }

    @Override
    public void tookTheBook(String bookName) {
        System.out.println(this.sayRole() + " " + this.sayName() + " решил взять почитать книгу " + bookName);
    }

    @Override
    public void returnedTheBook(Administrator administrator) {
        System.out.println(this.sayRole() + " " + this.sayName() + " посчитал книгу скучной и вернул ее " + administrator.sayRole() + " " + administrator.sayName());
    }
}