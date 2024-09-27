import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> catalog;

    public Library() {
        this.catalog = new ArrayList<>();
    }

    // Add a book to the catalog
    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Book added successfully.");
    }

    // Search for books by title
    public void searchByTitle(String title) {
        System.out.println("Search Results for Title: " + title);
        boolean found = false;
        for (Book book : catalog) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found with the title: " + title);
        }
    }

    // Search for books by author
    public void searchByAuthor(String author) {
        System.out.println("Search Results for Author: " + author);
        boolean found = false;
        for (Book book : catalog) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by the author: " + author);
        }
    }

    // List all books in the catalog
    public void listBooks() {
        System.out.println("Library Catalog:");
        if (catalog.isEmpty()) {
            System.out.println("No books in the catalog.");
        } else {
            for (Book book : catalog) {
                System.out.println(book);
            }
        }
    }
}
