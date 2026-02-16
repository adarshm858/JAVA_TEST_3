package JAVA_TEST_3;

import java.awt.print.Book;
import java.util.HashMap;

public class Library extends Books {

    private HashMap<String, Book> books = new HashMap<>();
    private int totalBooksCount = 0;

    public Library(String isbn, String title, boolean isAvailable) {
        super(isbn, title, isAvailable);
    }

    public void addBook(Book book) {
        books.put(book.setIsbn(), book);
        if (book.isAvailable()) {
            totalBooksCount++;
        }
    }
    public void borrowBook(String isbn) throws BookNotFoundException {
        if (!books.containsKey(isbn)) {
            throw new BookNotFoundException("ISBN " + isbn + " not found in the system.");
        }

        Book book = books.get(isbn);
        if (!book.isAvailable()) {
            throw new IllegalStateException("Book '" + book.getTitle() + "' is already borrowed.");
        }

        book.setAvailable(false);
        totalBooksCount--;
        System.out.println("Success! You have borrowed: " + book.getTitle());
    }
    public int getTotalBooksCount() {
        return totalBooksCount;
    }

    public static void main() {
        Library myLibrary = new Library();

        // 1. Initial Setup
        Book b1 = new Book("ISBN123", "Java Basics", true);
        Book b2 = new Book("ISBN456", "Data Structures", false);

        myLibrary.addBook(b1);
        myLibrary.addBook(b2);

        System.out.println( myLibrary.getTotalBooksCount());
        try {
            myLibrary.borrowBook("ISBN123");
        } catch (BookNotFoundException | IllegalStateException e) {
            System.err.println(e.getMessage());
        }
        System.out.println( myLibrary.getTotalBooksCount());

        try {
            myLibrary.borrowBook("ISBN456");
        } catch (BookNotFoundException | IllegalStateException e) {
            System.out.println( e.getMessage());
        }
        System.out.println(  myLibrary.getTotalBooksCount()); 

        try {
            myLibrary.borrowBook("ISBN999");
        } catch (BookNotFoundException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(myLibrary.getTotalBooksCount());
    }



}
