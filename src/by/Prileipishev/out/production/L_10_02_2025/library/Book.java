package by.Prileipishev.out.production.L_10_02_2025.library;

public class Book {

    protected String title;
    protected Author author;
    protected int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.title + " (" + this.year + ") - " + author.toString();
    }
}
