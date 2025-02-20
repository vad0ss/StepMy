package by.Prileipishev.out.production.L_10_02_2025.library;

public class Author {

    protected String name;
    protected String surname;
    protected int birthYear;

    public Author(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return this.surname + " " + this.name + " - " + this.birthYear;
    }
}
