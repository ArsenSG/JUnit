import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClassSupplierTest {
    private Book book;
    private ClassSupplier classSupplier;

    @BeforeEach
    public void beforeEach() {
        book = new Book("рандомную книгу");
        classSupplier = new ClassSupplier("Вася Пупкин", "Рандомный человек");
    }

    @Test
    public void testTookTheBook() {
        String argument = classSupplier.sayRole() + " " + classSupplier.sayName() + " решил взять почитать ";
        String bookName = book.getBookName();
        String expected = "Рандомный человек Вася Пупкин решил взять почитать рандомную книгу";

        String finalRes = argument.concat(bookName);

        Assertions.assertEquals(expected, finalRes);
    }
}
