import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ClassReaderTest {
    ClassAdmin admin;
    ClassReader reader;

    @Test
    public void testReturnedTheBook() {
        admin = new ClassAdmin("Валентина", "администратор");
        reader = new ClassReader("Моника", "читатель");

        Assertions.assertEquals(admin.role, "администратор");
        Assertions.assertEquals(reader.role, "читатель");
    }
}
