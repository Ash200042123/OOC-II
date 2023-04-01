package Task2;

public class RegularBook extends Book{
    private double discountPercentage=0.2;

    public RegularBook(String auth, String title, double baseRent) {
        super(auth, title, baseRent);
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
}
