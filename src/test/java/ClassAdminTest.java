import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClassAdminTest {
    ClassAdmin classAdmin;
    ClassReader classReader;
    Book book;

    @BeforeEach
    public void beforeEach() {
        classAdmin = new ClassAdmin("Анджелина Джоли", "Администраторша");
        classReader = new ClassReader("Дженнифер Энистон", "читательнице");
        book = new Book("Как отбить мужчину за 10 минут");
    }

    @Test
    public void testOverdueNotification() {
        String adminsName = classAdmin.name;
        String readersName = classReader.name;

        System.out.println(classAdmin.role + " " + classAdmin.name + " дала почитать " + classReader.role + " " + classReader.name + " книгу " + book.getBookName());

        Assertions.assertNotNull(adminsName);
        Assertions.assertNotNull(readersName);
    }
}
