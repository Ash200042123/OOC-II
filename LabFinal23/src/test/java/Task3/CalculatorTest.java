package Task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    @Test
    public void checkAdd(){
        Calculator calculator=new Calculator();
        assertEquals(10.5,calculator.add(5.1,5.4));
    }
    @Test
    public void checkSub(){
        Calculator calculator=new Calculator();
        assertEquals(9.153,calculator.subtract(18.893,9.74));
    }
    @Test
    public void checkMul(){
        Calculator calculator=new Calculator();
        assertEquals(61.305,calculator.multiply(3.05,20.1));
    }
    @Test
    public void checkDiv(){
        Calculator calculator=new Calculator();
        assertEquals(3.375,calculator.divide(10.8,3.2));
    }
}
