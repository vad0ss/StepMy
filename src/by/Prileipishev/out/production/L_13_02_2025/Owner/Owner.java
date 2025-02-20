package by.Prileipishev.out.production.L_13_02_2025.Owner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Owner {

    private int id;
    private String name;
    private String surName;
    private static String[] names = new String[5];
    private static String[] surNames = new String[5];
    private List<Pet> pets = new ArrayList<Pet>();
    private static int totalOwners = 0;
    private String sex;


    private static Random random = new Random();

    static {
        System.out.println("Класс Owner загружен в память!");

        names[0] = "Анна";
        names[1] = "Пётр";
        names[2] = "Ольга";
        names[3] = "Андрей";
        names[4] = "Павел";

        surNames[0] = "Свириденко";
        surNames[1] = "Моисеенко";
        surNames[2] = "Горбенко";
        surNames[3] = "Петренко";
        surNames[4] = "Маленко";
    }

    public Owner() {
        this.id = ++totalOwners;
        this.name = names[random.nextInt(names.length)];
        this.surName = surNames[random.nextInt(surNames.length)];
        this.sex = "male";
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

    public String getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", pets=" + pets +
                '}';
    }

}
