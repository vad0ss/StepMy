package by.Prileipishev.out.production.L_03_02_2025.Library;

import java.util.Arrays;
import java.util.Comparator;

public class Library {

    private int size;
    private Book[] books;

    Library(int size) {
        this.books = new Book[size];
    }

    public void addBook(Book book) {
        if (size < this.books.length) {
            this.books[this.size++] = book;
        } else {
            Book[] books1 = new Book[this.books.length + 1];

            for (int i = 0; i < books.length; i++) {
                books1[i] = books[i];
            }

            books1[this.size++] = book;
            this.books = books1;
        }
    }

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book.toString());
        }
    }

    public Book findBook(String bookTitle) {
        for (Book book : this.books) {

            if (book == null) {
                continue;
            }

            if (bookTitle.equals(book.getTitle())) {
                return book;
            }
        }

        return null;
    }

    public void sortBooksByYear() {
        Arrays.sort(books, Comparator.comparingInt(Book::getYear));
    }

    public void sortBooksByAuthorBirthYear() {
        Arrays.sort(books, Comparator.comparingInt(b -> b.getAuthor().getBirthYear()));
    }

}
