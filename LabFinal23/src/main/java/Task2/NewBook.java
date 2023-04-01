package Task2;

public class NewBook extends Book{
    private double extraCharge=0.3;

    public NewBook(String auth, String title, double baseRent) {
        super(auth, title, baseRent);
    }

    public double getExtraCharge() {
        return extraCharge;
    }
}
