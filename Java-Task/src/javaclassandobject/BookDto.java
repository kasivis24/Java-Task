package javaclassandobject;

public class BookDto {
    private String title;
    private String author;
    private String ISBN;
    private String publisher;
    private double price;
    private int publicationYear;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public static void main(String[] args) {
        BookDto b1 = new BookDto();
        b1.setAuthor("Daniel Kahneman");
        System.out.println("Author : "+b1.getAuthor());

        b1.setTitle("Thinking Fast and Slow");
        System.out.println("Title : "+b1.getTitle());

        b1.setISBN("978-0374275631");
        System.out.println("ISBN : "+b1.getISBN());

        b1.setPrice(499);
        System.out.println("Price : "+b1.getPrice());

        b1.setPublicationYear(2011);
        System.out.println("Year : "+b1.getPublicationYear());

        b1.setPublisher("PENGUIN UK");
        System.out.println("Publisher : "+b1.getPublisher());
    }
}