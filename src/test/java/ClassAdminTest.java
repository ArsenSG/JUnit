import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClassAdminTest {
    private ClassAdmin classAdmin;

    @BeforeEach
    public void beforeEach() {
        classAdmin = new ClassAdmin("Анджелина Джоли", "Администраторша");
    }

    @Test
    public void testOverdueNotification() {
        String adminsName = classAdmin.getName();

        System.out.println(classAdmin.getRole().equals("Администраторша") + " " + classAdmin.getName().equals("Анджелина Джоли"));

        Assertions.assertNotNull(adminsName);
    }
}
