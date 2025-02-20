package by.Prileipishev.out.production.L_10_02_2025.animal.Animal;

public abstract class Animal {

    protected String name;
    protected String species;
    protected int age;

    public Animal(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

    public abstract String makeSound();
    public abstract String move();
    public abstract String eat();


    @Override
    public String toString() {
        return this.species + " " + this.name + ", возраст: " + this.age;
    }

    public String sleeping() {
        return this.name + " спит";
    }
}
