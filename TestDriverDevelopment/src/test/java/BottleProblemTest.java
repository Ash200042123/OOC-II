import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BottleProblemTest {

    @Test
    void verse0() {
        String expected = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n";

        BottleProblem bottleProblem= new BottleProblem();
        //System.out.println(bottleProblem.verse(0));
        assertEquals(expected, bottleProblem.verse(0));
    }

    @Test
    void verse1() {
        String expected = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n";

        BottleProblem bottleProblem= new BottleProblem();
        //System.out.println(bottleProblem.verse(1));
        assertEquals(expected, bottleProblem.verse(1));
    }

    @Test
    void verse2() {
        String expected = "2"+" bottles of beer on the wall, "+"2"+" bottles of beer.\n" +
                "Take one down and pass it around, "+"1"+" bottle of beer on the wall.\n";

        BottleProblem bottleProblem= new BottleProblem();
        //System.out.println(bottleProblem.verse(2));
        assertEquals(expected, bottleProblem.verse(2));
    }

    @Test
    void verse3() {
        String expected = "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take one down and pass it around, 2 bottles of beer on the wall.\n";

        BottleProblem bottleProblem= new BottleProblem();
        //System.out.println(bottleProblem.verse(3));
        assertEquals(expected, bottleProblem.verse(3));
    }

    @Test
    void verse50() {
        String expected = "50 bottles of beer on the wall, 50 bottles of beer.\n" +
                "Take one down and pass it around, 49 bottles of beer on the wall.\n";


        BottleProblem bottleProblem= new BottleProblem();
        //System.out.println(bottleProblem.verse(50));
        assertEquals(expected, bottleProblem.verse(50));
    }

    @Test
    void verse70to50() {
        String expected = "";

        for (int i = 70; i >= 50; i--) {
            int j=i-1;
            expected= expected + i+" bottles of beer on the wall, " + i + " bottles of beer.\n" +
                    "Take one down and pass it around, " + j +" bottles of beer on the wall.\n";
        }



        BottleProblem bottleProblem= new BottleProblem();
        //System.out.println(bottleProblem.verse(70,50));
        assertEquals(expected, bottleProblem.verse(70,50));
    }

    @Test
    void allVerse() {
        String expected = "";

        for (int i = 99; i >= 3; i--) {
            int j=i-1;
            expected= expected + i+" bottles of beer on the wall, " + i + " bottles of beer.\n" +
                    "Take one down and pass it around, " + j +" bottles of beer on the wall.\n";
        }

        expected+="2"+" bottles of beer on the wall, "+"2"+" bottles of beer.\n" +
                "Take one down and pass it around, "+"1"+" bottle of beer on the wall.\n";

        expected+= "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n";

        expected+="No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.\n";

        BottleProblem bottleProblem= new BottleProblem();
        //System.out.println(bottleProblem.fullVerse());
        assertEquals(expected, bottleProblem.fullVerse());
    }

}
