import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {

    @Test
    void test1(){
        double expectedWage = 480;
        int expectedVac = 0;

        DayLabourer dayLabourer= new DayLabourer(5,200);
        System.out.println(dayLabourer.YearlyVacation());
        System.out.println(dayLabourer.YearlyWage());
        //assertEquals(expectedWage, dayLabourer.YearlyWage());
        assertEquals(expectedVac, dayLabourer.YearlyVacation());
    }

    @Test
    void test2(){
        double expectedWage = 7920;
        int expectedVac = 20;

        Permanent permanentWorker= new Permanent(5,200);
        System.out.println(permanentWorker.YearlyVacation());
        System.out.println(permanentWorker.YearlyWage());
        assertEquals(expectedWage, permanentWorker.YearlyWage());
        //assertEquals(expectedVac, permanentWorker.YearlyVacation());
    }


    @Test
    void test3(){
        double expectedWage = 2400;
        int expectedVac = 21;

        MonthlyContractor monthlyContractor= new MonthlyContractor(5,200);
        System.out.println(monthlyContractor.YearlyVacation());
        System.out.println(monthlyContractor.YearlyWage());
        assertEquals(expectedWage, monthlyContractor.YearlyWage());
        //assertEquals(expectedVac, monthlyContractor.YearlyVacation());
    }

    @Test
    void test4(){

        DayLabourer dayLabourer = new DayLabourer(5,100);

        assertInstanceOf(DayLabourer.class, dayLabourer);


    }

}
