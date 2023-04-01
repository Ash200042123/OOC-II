package Task2;

public class KidsBook extends Book{

    private double discountPercentage=0.1;

    public KidsBook(String auth, String title, double baseRent) {
        super(auth, title, baseRent);
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}
