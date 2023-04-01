package Task2;

public class RentService {

    public double calculateRent(Book booktype, int days){
        if(booktype.getClass()== RegularBook.class){
            if(days<=7)
                return (booktype.getBaseRent()*days)-(((RegularBook) booktype).getDiscountPercentage()* booktype.getBaseRent()*days);
            else
                return (booktype.getBaseRent()*days)-(((RegularBook) booktype).getDiscountPercentage()* booktype.getBaseRent()*days)+((days-7)*4);
        } else if (booktype.getClass()== KidsBook.class) {
            if(days<=7)
                return (booktype.getBaseRent()*days)-(((KidsBook) booktype).getDiscountPercentage()* booktype.getBaseRent()*days);
            else
                return (booktype.getBaseRent()*days)-(((KidsBook) booktype).getDiscountPercentage()* booktype.getBaseRent()*days)+((days-7)*4);
        }
        else {
            if(days<=7)
                return (booktype.getBaseRent()*days)+(((NewBook) booktype).getExtraCharge()* booktype.getBaseRent()*days);
            else
                return (booktype.getBaseRent()*days)+(((NewBook) booktype).getExtraCharge()* booktype.getBaseRent()*days)+((days-7)*4);
        }
        }
    }

