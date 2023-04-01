import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class moneyTest {
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
//        five.times(2);
//        assertEquals(12,five.amount);

        Dollar product = five.times(4);
        assertEquals(20, product.getAmount());
    }

    @Test
            public void testEquality(){
        assertEquals(new Dollar(10),new Dollar(10));
    }

}
