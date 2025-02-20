package by.Prileipishev.out.production.L_03_02_2025.Library;

public class Author {

    private String name;
    private String surName;
    private int birthYear;

    public Author(String name, String surName, int birthYear) {
        this.name = name;
        this.surName = surName;
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return this.surName + " " + this.name + " - " + this.birthYear;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getBirthYear() {
        return birthYear;
    }

}