public class Book {
    private String name;
    private String author;
    private int yearOfPublished;
    private double price;

    public Book(String name, String author, int yearOfPublished, double price){
        this.name = name;
        this.author = author;
        this.yearOfPublished = yearOfPublished;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return "Book [name = " + name + ", author = " + author + ", price = " + price +", yearOfPublished = " +yearOfPublished+"]";
    }
}