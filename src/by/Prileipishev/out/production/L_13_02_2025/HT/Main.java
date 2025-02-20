package by.Prileipishev.out.production.L_13_02_2025.HT;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static List<String> catNames = new ArrayList<String>();
    private static List<String> dogNames = new ArrayList<String>();

    static {
        catNames.add("Мурка");
        catNames.add("Ася");
        catNames.add("Буся");
        catNames.add("Муся");
        catNames.add("Лесси");
        catNames.add("Багира");
        catNames.add("Пиратка");
        catNames.add("Чарлита");
        catNames.add("Гoлди");
        catNames.add("Дoрa");

        dogNames.add("Аpчи");
        dogNames.add("Айзек");
        dogNames.add("Бакс");
        dogNames.add("Беляш");
        dogNames.add("Блэк");
        dogNames.add("Волчок");
        dogNames.add("Грэй");
        dogNames.add("Грег");
        dogNames.add("Джерик");
        dogNames.add("Джет");
    }

    public static void main(String[] args) {

        ArrayList<Owner> owners = new ArrayList<Owner>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            owners.add(new Owner());
        }

        for (Owner owner : owners) {
            for (int i = 0; i < 2; i++) {
                Pet pet = random.nextBoolean() ? new Cat(catNames.get(random.nextInt(10)), "кошка", random.nextInt(10))
                        : new Dog(dogNames.get(random.nextInt(10)), "собака", random.nextInt(10));
                owner.addPet(pet);
            }
            System.out.println(owner);
        }

        System.out.println("Общее количество владельцев : " + Owner.getTotalOwners());
    }
}
