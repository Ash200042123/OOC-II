package Task2;

import Task2.KidsBook;
import Task2.NewBook;
import Task2.RegularBook;
import Task2.RentService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class RentServiceTest {
    @Test
    public void RegularBookRentCheck1(){
        RentService rentService = new RentService();
        RegularBook regularBook = new RegularBook("Shuvro","OOC",100);

        double rent1 = rentService.calculateRent(regularBook,8);

        assertEquals(644,rent1);
    }

    @Test
    public void RegularBookRentCheck2(){
        RentService rentService = new RentService();
        RegularBook regularBook = new RegularBook("Shuvro","OOC",100);

        double rent1 = rentService.calculateRent(regularBook,5);

        assertEquals(400,rent1);
    }

    @Test
    public void KidsBookRentCheck1(){
        RentService rentService = new RentService();
        KidsBook kidsBook = new KidsBook("Shoyeb","LA",120);

        double rent1 = rentService.calculateRent(kidsBook,8);

        assertEquals(868,rent1);
    }

    @Test
    public void KidsBookRentCheck2(){
        RentService rentService = new RentService();
        KidsBook kidsBook = new KidsBook("Shoyeb","LA",120);

        double rent1 = rentService.calculateRent(kidsBook,4);

        assertEquals(432,rent1);
    }

    @Test
    public void NewBookRentCheck1(){
        RentService rentService = new RentService();
        NewBook newBook = new NewBook("Ridun","LA",150);

        double rent1 = rentService.calculateRent(newBook,8);

        assertEquals(1564,rent1);
    }

    @Test
    public void NewBookRentCheck2(){
        RentService rentService = new RentService();
        NewBook newBook = new NewBook("Ridun","LA",150);

        double rent1 = rentService.calculateRent(newBook,3);

        assertEquals(585,rent1);
    }
}
