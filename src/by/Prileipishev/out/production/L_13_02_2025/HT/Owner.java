package by.Prileipishev.out.production.L_13_02_2025.HT;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Owner {

    private int id;
    private String name;
    private String surName;
    private List<Pet> pets = new ArrayList<Pet>();
    private static int totalOwners = 0;

    static {
        System.out.println("Класс Owner загружен в память!");
    }

    public Owner(String name, String surName) {
        this.id = ++totalOwners;
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public static int getTotalOwners() {
        return totalOwners;
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
        pet.setOwner(this);
    }

    @Override
    public String toString() {
        return this.name + " " + this.surName + " количество питомцев: " + this.pets.size();
    }

}
