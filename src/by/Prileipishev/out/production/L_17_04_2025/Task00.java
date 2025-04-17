package by.Prileipishev.out.production.L_17_04_2025;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Task00 {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        List<String> strings2 = new ArrayList<>();
        strings.add("Julia");
        strings.add("Sergey");
        strings.add("Petr");
        List<Apple> apples = new ArrayList<>();

        apples.add(new Apple(110, Color.GREEN));
        apples.add(new Apple(100, Color.RED));
        apples.add(new Apple(100, Color.GREEN));
        apples.add(new Apple(120, Color.YELLOW));


        strings.forEach(System.out::println);
        strings.forEach(s -> strings2.add(s + " Ivanenko"));

        System.out.println(strings2);

        List<Integer> mapList = map(strings, s -> s.length());

        System.out.println(mapList);

        List<Color> colorList = map(apples, apple -> apple.getColor());

        System.out.println(colorList);
        Random r = new Random();

        Supplier<Integer> supplier = () -> r.nextInt(100);
        System.out.println(supplier.get());

        final int a = 10;
        Runnable runnable = () -> System.out.println(a);
        runnable.run();

        List<Color> m = map(apples, Apple::getColor);
        List<Integer> weights = map(apples, Apple::getWeight);

        System.out.println(weights);

        Supplier<Apple> supApple = Apple::new;

        Apple apple = supApple.get();

        BiFunction<Integer, Color, Apple> biApple = Apple::new;

        Apple myApple = biApple.apply(110, Color.GREEN);

        System.out.println(myApple);

        //apples.sort((ap,bp) -> ap.getWeight().compareTo(bp.getWeight()));
        Comparator<Apple> comparing = Comparator.comparing(Apple::getWeight)
                .reversed()
                .thenComparing(Apple::getColor);

        apples.sort(comparing);

        Predicate<Apple> applePredicate = (Apple a5) -> a5.getWeight() == 100;
        applePredicate.and((Apple a6) -> a6.getColor() == Color.GREEN);

        System.out.println(apples.stream().filter(applePredicate).toString());
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }

    public static <T, R> List<R> map(List<T> list, Function<T,R> f) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(f.apply(t));
        }
        return result;
    }

}
