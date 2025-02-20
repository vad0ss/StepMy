package by.Prileipishev.out.production.L_03_02_2025.Library;

public class Ebook extends Book {

    private double fileSize;

    public Ebook(String title, Author author, int year, BookTypes genre, double fileSize) {
        super(title, author, year, genre);
        this.fileSize = fileSize;
    }

    @Override
    public String toString() {
        return super.getDescription() + " Размер файла := " + this.fileSize + " МБ";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Размер файла := " + this.fileSize + " МБ";
    }

}