package by.Prileipishev.out.production.L_27_03_2025.RandomPicker.factory;

import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.enums.Sex;
import by.Prileipishev.out.production.L_27_03_2025.RandomPicker.models.Participant;

import java.util.List;
import java.util.Random;

public class ParticipiantFactory {

    private static final List<String> maleNameGenerator = List.of("Андрей", "Дмитрий", "Василий", "Геннадий");
    private static final List<String> femaleNameGenerator = List.of("Анна", "Дарья", "Яна", "Ирина");
    private static final Random random = new Random();

    private ParticipiantFactory() {}

    public static Participant next() {
        Sex sex = random.nextBoolean() ? Sex.MALE : Sex.FEMALE;
        String name = sex.getGender().equals("Мужской") ? maleNameGenerator.get(random.nextInt(4)) : femaleNameGenerator.get(random.nextInt(4));
        Integer age = random.nextInt(10,60);
        Integer passportId = random.nextInt(1, 9);

        return new Participant(name,age,passportId,sex);
    }
}
