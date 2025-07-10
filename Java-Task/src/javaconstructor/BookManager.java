package javaconstructor;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books;

    public BookManager(){
        this.books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayBooks(){
        if(books.isEmpty()){
            System.out.println("No books available");
        }
        else{
            for(Book book : books){
                System.out.println(book);
            }
        }
    }

    public static void main(String[] args) {

        BookManager bookManager = new BookManager();

        bookManager.addBook(new Book("A House","V.S.NaiPaul",1961,999.0));
        bookManager.addBook(new Book("A Bunch Of Old Letters","Jawaharlal Nehru",1958,1250.0));
        bookManager.addBook(new Book("A Death in Shonagachhi","Rijula Das",2021,2000.0));

        bookManager.displayBooks();
    }
}