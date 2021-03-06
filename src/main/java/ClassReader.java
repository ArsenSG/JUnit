import interfaces.Administrator;
import interfaces.Reader;

public class ClassReader extends User implements Reader {
    ClassReader(String name, String role) {
        super(name, role);
    }

    @Override
    public void tookTheBook(String bookName) {
        System.out.println(this.sayRole() + " " + this.sayName() + " взял почитать книгу " + bookName);
    }

    @Override
    public void returnedTheBook(Administrator administrator) {
        System.out.println("После замечания " + administrator.sayRole() + " " + administrator.sayName() + " " + this.sayRole() + " " + this.sayName() + " вернул книгу ");
    }

    @Override
    public String sayName() {
        return getName();
    }

    @Override
    public String sayRole() {
        return getRole();
    }
}