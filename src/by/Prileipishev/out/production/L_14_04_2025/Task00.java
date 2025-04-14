package by.Prileipishev.out.production.L_14_04_2025;

import by.Prileipishev.out.production.L_14_04_2025.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task00 {

    public static void main(String[] args) {

        Random random = new Random();
        List<String> colors = List.of("GREEN", "RED", "YELLOW");
        List<Apple> apples = new ArrayList<>();
        List<Integer> digits = List.of(1,2,3,4,5,6,7,8,9,10);

        for (int i = 0; i < 10; i++) {
            String c = colors.get(random.nextInt(0, 3));
            Apple apple = new Apple(random.nextInt(1, 200), Color.valueOf(c));
            apples.add(apple);
            System.out.println(apples.get(i));
        }

//        System.out.println(filterColorApples(apples, Color.GREEN));
//        System.out.println(filterColorApples(apples, Color.RED));
//        System.out.println(filterHeavyApples(apples, 130));
//        System.out.println(filterHeavyApples(apples, 150));
//        System.out.println("===================================");
//        System.out.println(filterApplesByType(apples, Color.GREEN, 150, true));
//        System.out.println(filterApplesByType(apples, Color.GREEN, 120, false));


       // System.out.println(filterAppleByPredicate(apples, new AppleGreenColorPredicate()));
       // System.out.println(filterAppleByPredicate(apples, new AppleHeavyWeightPredicate()));
//        System.out.println(filterAppleByPredicate(apples, new ApplePredicate() {
//            @Override
//            public boolean test(Apple apple) {
//                return Color.RED.equals(apple.getColor());
//            }
//        }));

        System.out.println(filterByPredicate(apples, (Apple apple) -> Color.YELLOW.equals(apple.getColor())));
        System.out.println(filterByPredicate(digits, (Integer num) -> num % 2 == 0));
    }

    private static List<Apple> filterColorApples(List<Apple> apples, Color color) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : apples) {
            if (color.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterHeavyApples(List<Apple> apples, int weight) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : apples) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    private static List<Apple> filterApplesByType(List<Apple> apples, Color color, int weight, boolean type) {
        return type ? filterColorApples(apples, color) : filterHeavyApples(apples, weight);
    }

    private static <T> List<T> filterByPredicate(List<T> harvest, ApplePredicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T t : harvest) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }
}
