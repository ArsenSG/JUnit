import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClassSupplierTest {
    private ClassSupplier classSupplier;

    @BeforeEach
    public void beforeEach() {
        classSupplier = new ClassSupplier("Вася Пупкин", "Рандомный человек");
    }

    @Test
    public void testTookTheBook() {
        String argument = classSupplier.sayRole() + " " + classSupplier.sayName();
        String text = " решил взять почитать рандомную книгу";
        String expected = "Рандомный человек Вася Пупкин решил взять почитать рандомную книгу";

        String finalRes = argument.concat(text);

        Assertions.assertEquals(expected, finalRes);
    }
}
