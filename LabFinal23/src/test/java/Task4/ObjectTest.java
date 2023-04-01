package Task4;

import Task2.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ObjectTest {
    @Test
    public void checkSuperClass(){
        Book book= new Book("Ash","none",123);
        assertTrue(book instanceof Object);
    }
}
