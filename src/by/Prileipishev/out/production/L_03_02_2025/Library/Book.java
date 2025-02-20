package by.Prileipishev.out.production.L_03_02_2025.Library;

public class Book {

    private String title;
    private Author author;
    private int year;
    private BookTypes genre;

    public Book(String title, Author author, int year, BookTypes genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return this.title + " " + "(" + this.year + ")" + " " + this.author.getName() + " " + this.author + " " + this.genre;
    }

    public String getDescription() {
        return this.title + " " + "(" + this.year + ")" + " " + this.author.getName() + " " + this.author + " " + this.genre;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGenre(BookTypes genre) {
        this.genre = genre;
    }
}
