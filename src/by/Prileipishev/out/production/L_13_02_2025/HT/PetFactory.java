package by.Prileipishev.out.production.L_13_02_2025.HT;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PetFactory {

    private static List<String> catNames = new ArrayList<String>();
    private static List<String> dogNames = new ArrayList<String>();

    private static Random random = new Random();

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

    public static Pet next() {
        return random.nextBoolean() ? new Cat(catNames.get(random.nextInt(10)), "кошка", random.nextInt(10))
                : new Dog(dogNames.get(random.nextInt(10)), "собака", random.nextInt(10));
    }

}
