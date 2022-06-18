import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ClassReaderTest {

    @Test
    public void testReturnedTheBook() {
        ClassReader reader = new ClassReader("Моника", "читатель");

        System.out.println(reader.getRole() + " " + reader.getName());

        Assertions.assertEquals("Моника", reader.sayName());
        Assertions.assertEquals("читатель", reader.sayRole());
    }
}
