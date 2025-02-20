package by.Prileipishev.out.production.L_13_02_2025.Owner;

import java.util.Random;

public abstract class Pet extends Animal {

    private static String[] surNames = new String[5];
    private static Random r = new Random();
    private Owner owner;

    public Pet(String name, String species, int age) {
        super(name, species, age);
    }

    public abstract String play();

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getOwnerName() {
        return this.owner == null ? "Без владельца" : this.owner.getName();
    }

    @Override
    public String toString() {
        return super.toString() + " (Домашнее животное) " + this.owner.getName() + " " + this.owner.getSurName();
    }
}
