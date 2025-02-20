package by.Prileipishev.out.production.L_13_02_2025.Animal;

public abstract class Animal {

    protected int id; // unique identifikator

    protected String name;

    protected String species;

    protected int age;

    private static int totalAnimals = 0;

    public Animal(String name, String species, int age) {
        this.id = ++totalAnimals;
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract String makeSound();
    public abstract String move();
    public abstract String eat();

    @Override
    public String toString() {
        return this.species + " " + this.name + ", возраст: " + this.age + " (ID: " + this.id + ")";
    }

    public String sleeping() {
        return this.name + " спит";
    }

    public static int getTotalAnimals() {
        return totalAnimals;
    }
}
