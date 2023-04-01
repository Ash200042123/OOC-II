import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GenericMaxStackTest {

    @Test
    void test1() throws Exception {
        int expected = 3;

        GenericMaxStack stack= new GenericMaxStack();
        stack.push(3);
        stack.push(5);
        stack.push(2);
        //System.out.println(stack.max());
        assertEquals(expected, stack.max());
    }

    @Test
    void test2() throws Exception {
        int expected = 2;

        GenericMaxStack stack= new GenericMaxStack();
        stack.push(2);
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.pop();

        //System.out.println(stack.max());
        assertEquals(expected, stack.max());
    }

    @Test
    void test3() throws Exception {
        Object expected = 49.75;

        GenericMaxStack stack= new GenericMaxStack();
        stack.push(49.75);
        stack.push(23.54);
        stack.push(100.0);
        //System.out.println(stack.max());
        //assertEquals(expected, stack.max());
        stack.pop();
        assertEquals(expected, stack.max());

    }

    @Test
    void test4() throws Exception {
        Object expected = "OOC is bad";

        GenericMaxStack stack= new GenericMaxStack();
        stack.push("OOC is bad");
        stack.push("Nothing to understand");
        stack.push("Try hard");
        //System.out.println(stack.max());
        stack.pop();
        assertEquals(expected, stack.max());
    }


}
