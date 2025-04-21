package by.Prileipishev.out.production.L_21_04_2025;


import java.util.*;
import java.util.stream.Collectors;

public class Task00 {

    // stream писать запрос а не код импровизированной реализации
    // полученное из источников последовательность элементов, поддерживающая операции обработки данных
    // сущестувуют два вида операций в стримах, промежуточные и завершающие (терминальные)
    // filter(Predicate), map (T -> R), limit, sorted (Comparator T,T), distinct - всегда возвращает Stream
    // void forEach(Consumer), long count(), collect
    // collect - производит свёртку потока данных с целью создания коллекции
    // терминальная операция в конце и только одна

    public static void main(String[] args) {

        Random random = new Random();

        List<Dish> list = Arrays.asList(
                new Dish("pork", false, 800, Type.MEET),
                new Dish("beef", false, 700, Type.MEET),
                new Dish("chicken", false, 400, Type.MEET),
                new Dish("french fries", true, 530, Type.OTHER),
                new Dish("rice", true, 350, Type.OTHER),
                new Dish("season fruit", true, 120, Type.OTHER),
                new Dish("pizza", false, 550, Type.OTHER),
                new Dish("prawns", false, 300, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH),
                new Dish("salmon", false, 450, Type.FISH)
        );

        // System.out.println(filter(list));

        List<String> collect = list.stream()
                .filter(dish -> dish.getCal() > 300)
                .sorted(Comparator.comparing(Dish::getCal))
                .map(Dish::getName)
//                .limit(3)
                .distinct()
                .collect(Collectors.toList());

        list.stream()
                .filter(dish -> dish.getCal() > 300)
                .sorted(Comparator.comparing(Dish::getCal))
                .map(Dish::getName)
                .distinct()
                .forEach(System.out::println);

        //System.out.println(collect);

        list.stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        boolean isVegetable = list.stream().anyMatch(Dish::isVegetable);
        boolean allMatch = list.stream().allMatch(dish -> dish.getCal() < 1000);
        boolean noneMatch = list.stream().noneMatch(dish -> dish.getCal() >= 1000);

//класс optional представляет собой класс контейнер, который отражает наличие или отсутсвие значения
        Optional<Dish> any = list.stream()
                .filter(Dish::isVegetable)
                .findAny();

        if (any.isPresent()) {
            Dish dish = any.get();
        }

        list.stream()
                .filter(Dish::isVegetable)
                .findAny()
                .ifPresent(d -> System.out.println(d.getName()));
        list.stream()
                .filter(Dish::isVegetable)
                .findFirst()
                .ifPresent(d -> System.out.println(d.getName()));

        int sum = list.stream()
                .mapToInt(Dish::getCal).sum();

        int max1 = list.stream()
                .mapToInt(Dish::getCal).max().orElse(1);

        Map<Type, List<Dish>> collect1 = list.stream().collect(Collectors.groupingBy(Dish::getType));

        System.out.println(collect1);

    }

    public static List<String> filter(List<Dish> list) {

        List<String> result = new ArrayList<>();

//        list.sort(new Comparator<Dish>() {
//            @Override
//            public int compare(Dish o1, Dish o2) {
//                return Integer.compare(o1.getCal(), o2.getCal());
//            }
//        });

        list.sort(Comparator.comparing(Dish::getCal));

        for (Dish dish : list) {
            if (dish.getCal() < 400) {
                result.add(dish.getName());
            }
        }

        return result;
    }

}
