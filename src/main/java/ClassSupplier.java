import interfaces.Administrator;
import interfaces.Librarian;
import interfaces.Reader;
import interfaces.Supplier;

public class ClassSupplier extends User implements Supplier, Reader {
    ClassSupplier(String name, String role) {
        super(name, role);
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