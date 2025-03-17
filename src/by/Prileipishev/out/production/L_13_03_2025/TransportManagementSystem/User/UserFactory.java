package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.User;

import java.util.List;
import java.util.Random;

public class UserFactory {

    private static final List<String> names = List.of("Андрей", "Дмитрий", "Василий", "Геннадий", "Павел", "Александр", "Григорий", "Вячеслав", "Денис", "Григорий");
    private static final List<String> surnames = List.of("Иванов", "Новиков", "Ковалёв", "Петров", "Котов", "Смирнов", "Ковалёв", "Морозов", "Романов", "Миронов");
    private static final Random random = new Random();

    private UserFactory() {};

    public static User next() {
        return new User(names.get(random.nextInt(names.size())), surnames.get(random.nextInt(surnames.size())));
    }

}
