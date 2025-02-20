package by.Prileipishev.out.production.L_10_02_2025.animal.Animal;

public abstract class WildAnimal extends Animal {

    protected String habitat;

    public WildAnimal(String name, String species, int age, String habitat) {
        super(name, species, age);
        this.habitat = habitat;
    }

    public abstract String hunt();

}
