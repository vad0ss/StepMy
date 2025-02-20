package by.Prileipishev.out.production.L_13_02_2025.Animal;

import java.util.Random;

public abstract class Pet extends Animal {

    private static String[] surNames = new String[5];
    private static Random r = new Random();

    static {
        surNames[0] = "Свириденко";
        surNames[1] = "Моисеенко";
        surNames[2] = "Горбенко";
        surNames[3] = "Петренко";
        surNames[4] = "Маленко";
    }

    protected String ownerName;

    protected String ownerSurname;

    public Pet(String name, String species, int age, String ownerName) {
        super(name, species, age);
        this.ownerName = ownerName;
        this.ownerSurname = surNames[r.nextInt(surNames.length)];
    }

    public abstract String play();

    @Override
    public String toString() {
        return super.toString() + " (Домашнее животное) " + ownerName + " " + ownerSurname;
    }
}
