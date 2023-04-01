import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapesProblemTest {
    @Test
    void testCircleSquare() {
        ArrayList<String> expected = new ArrayList<String>();
        ArrayList<String> found = new ArrayList<String>();

        expected.add("drawing circle\n");
        expected.add("drawing square\n");

        Circle circle1=new Circle();
        Square square1=new Square();

        found=circle1.Draw();
        found=square1.Draw();

        assertEquals(expected, found);
    }

    @Test
    void testSquare() {
        ArrayList<String> expected = new ArrayList<String>();
        ArrayList<String> found = new ArrayList<String>();

        expected.add("drawing square\n");

        Square square1=new Square();
        found=square1.Draw();

        assertEquals(expected, found);
    }

    @Test
    void testRectangle() {
        //String expected = "drawing rectangle\n";
        ArrayList<String> expected = new ArrayList<String>();
        ArrayList<String> found = new ArrayList<String>();

        expected.add("drawing rectangle\n");
        expected.add("drawing rectangle\n");

        Rectangle rectangle1=new Rectangle();


        Rectangle rectangle2=new Rectangle();
        found=rectangle2.Draw();

        assertEquals(expected, found);
    }

}
