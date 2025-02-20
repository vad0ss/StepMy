package by.Prileipishev.out.production.L_27_01_2025.Military_HT;

import java.util.Random;

public class RecruitGenerator {

    String[] firstNames = {"Пётр", "Алексей", "Иван", "Андрей", "Павел", "Юрий", "Игорь", "Дмитрий", "Александр", "Валерий", "Евгений", "Денис"};
    String[] lastNames = {"Иванов", "Петров", "Сидоров", "Соколов", "Игнатич", "Смолич", "Василёнок", "Ковалёнок", "Артемёнок", "Зубовский", "Демидович", "Котов"};
    String[] middleNames = {"Петрович", "Алексеевич", "Иванович", "Андреевич", "Павлович", "Юрьевич", "Игоревич", "Дмитриевич", "Александрович", "Валерьевич", "Евгеньевич", "Денисович"};
    Random random = new Random();


    public Recruit generate() {
        Recruit recruit = new Recruit();

        recruit.setFirstName(this.firstNames[random.nextInt(12)]);
        recruit.setLastName(lastNames[random.nextInt(12)]);
        recruit.setMiddleName(middleNames[random.nextInt(12)]);
        recruit.setImplantCount(random.nextInt(3));
        recruit.setCardiogram(random.nextInt(130));
        recruit.setVisionCoeff(random.nextDouble(1.5));
        recruit.setFlatFeet(random.nextBoolean());

        return recruit;
    }

}
