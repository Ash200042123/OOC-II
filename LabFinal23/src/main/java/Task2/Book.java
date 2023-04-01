package Task2;

public class Book {
    private String Author;
    private String Title;
    private double baseRent;

    public Book(String auth, String title, double baseRent){
        this.setBaseRent(baseRent);
        this.setAuthor(auth);
        this.setTitle(title);
    }


    public void setAuthor(String author) {
        Author = author;
    }

    public void setBaseRent(double baseRent) {
        this.baseRent = baseRent;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public double getBaseRent() {
        return baseRent;
    }

    public String getAuthor() {
        return Author;
    }

    public String getTitle() {
        return Title;
    }
}
