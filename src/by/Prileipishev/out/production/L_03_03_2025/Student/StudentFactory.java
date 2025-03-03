package by.Prileipishev.out.production.L_03_03_2025.Student;

import java.util.List;
import java.util.Random;

public class StudentFactory {

    private static List<String> names = List.of("Андрей", "Дмитрий", "Василий","Анна","Павел","Александр","Григорий","Вячеслав", "Светлана", "Татьяна");
    private static Random random = new Random();

    private StudentFactory() {};

    public static Student next() {
        return new Student(names.get(random.nextInt(10)), random.nextInt(18,60), random.nextDouble(0,10));
    }

}
