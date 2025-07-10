import java.util.List;

class Book {
    String title;
    String author;
    String isbn;
}

class Library {
    List<Book> books;
    List<Member> members;
}

class Member {
    String name;
    String memberId;
    List<Book> issuedBooks;

    void issueBook(Book book) {
        issuedBooks.add(book);
    }

    void returnBook(Book book) {
        issuedBooks.remove(book);
    }
}

class Librarian extends Member {
    void addBook(Book book, Library lib) {
        lib.books.add(book);
    }

    void removeBook(Book book, Library lib) {
        lib.books.remove(book);
    }
}

