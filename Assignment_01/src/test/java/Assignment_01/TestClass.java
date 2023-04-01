package Assignment_01;

import assignment1.Date;
import assignment1.FactoryDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestClass {

    @Test
    public void NextDate1() throws Exception{
        FactoryDate factoryDate = new FactoryDate(1,1,2021);
        //System.out.println(factoryDate.get_next_date());
        assertEquals("2/1/2021",factoryDate.getNextDate());
    }

    @Test
    public void NextDate2() throws Exception{
        //last day of normal february
        FactoryDate factoryDate = new FactoryDate(28,02,2021);
        assertEquals("1/3/2021",factoryDate.getNextDate());
    }
    @Test
    public void NextDate3() throws Exception{
        //28th day of february leap year
        FactoryDate factoryDate = new FactoryDate(28,02,2020);
        assertEquals("29/2/2020",factoryDate.getNextDate());
    }
    @Test
    public void NextDate4() throws Exception{
        //last day of february leap year
        FactoryDate factoryDate = new FactoryDate(29,02,2020);
        assertEquals("1/3/2020",factoryDate.getNextDate());
    }

    @Test
    public void NextDate5() throws Exception{
        //Last day of December
        FactoryDate factoryDate = new FactoryDate(31,12,2021);
        assertEquals("1/1/2022",factoryDate.getNextDate());
    }

    @Test
    public void NextDate6() throws Exception{
        //Any day in December
        FactoryDate factoryDate = new FactoryDate(28,12,2021);
        assertEquals("29/12/2021",factoryDate.getNextDate());
    }


    @Test
    public void NextDate7() throws Exception{
        //last day of a 30 days month
        FactoryDate factoryDate = new FactoryDate(30,9,2021);
        assertEquals("1/10/2021",factoryDate.getNextDate());
    }

    @Test
    public void NextDate8() throws Exception{
        //last day of a 31 days month
        FactoryDate factoryDate = new FactoryDate(31,03,2021);
        assertEquals("1/4/2021",factoryDate.getNextDate());
    }
    }
