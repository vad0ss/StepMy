package by.Prileipishev.out.production.L_10_02_2025.animal.Animal;

public abstract class Pet extends Animal {

    protected String ownerName;

    public Pet(String name, String species, int age, String ownerName) {
        super(name, species, age);
        this.ownerName = ownerName;
    }

    public abstract String play();
}
