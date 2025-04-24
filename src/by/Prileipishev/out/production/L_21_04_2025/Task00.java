package by.Prileipishev.out.production.L_21_04_2025;


import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<Dish> list2 = Arrays.asList(
                new Dish("pork2", false, 500, Type.MEET),
                new Dish("beef2", false, 600, Type.MEET),
                new Dish("chicken2", false, 300, Type.MEET),
                new Dish("french fries2", true, 550, Type.OTHER),
                new Dish("rice2", true, 360, Type.OTHER),
                new Dish("season fruit2", true, 130, Type.OTHER),
                new Dish("pizza2", false, 570, Type.OTHER),
                new Dish("prawns2", false, 350, Type.FISH),
                new Dish("salmon2", false, 470, Type.FISH)
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

        List<List<Dish>> listList = List.of(list, list2);

        List<Dish> dishes = listList.stream()
                .map(Collection::stream)
                .flatMap(Stream::distinct)
                .collect(Collectors.toList());

        List<Dish> dishes2 = listList.stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());

        System.out.println(dishes);
        System.out.println(dishes2);

        int[] nums = {1, 2, 3, 4, 5};
        int sum1 = Arrays.stream(nums).sum();
        System.out.println(sum1);

        Dish nullDish = new Dish("pork", false, 800, Type.MEET);

        List<String> list3 = Stream.of("test", "home", "dish", "javascript")
                .map(String::toUpperCase).toList();

        Stream.ofNullable(nullDish).map(Dish::getCal).forEach(System.out::println);

        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        Stream.iterate(0, n -> n < 100, n -> n + 4)
                .forEach(System.out::println);

        Stream.generate(Math::random)
                .limit(5)
                .forEach(System.out::println);

        String stringDishNames = list.stream()
                .map(Dish::getName)
                .collect(Collectors.joining(", "));

        System.out.println(stringDishNames);

        Long dishCounter = list.stream()
                .map(Dish::getName)
                .collect(Collectors.counting());

        System.out.println(dishCounter);

        Optional<Dish> calCount = list.stream()
                .collect(Collectors.maxBy(Comparator.comparingInt(Dish::getCal)));

        if (calCount.isPresent()) {
            System.out.println(calCount);
        }

        Integer sumCal = list.stream().collect(Collectors.summingInt(Dish::getCal));

        System.out.println(sumCal);

        Double avgCal = list.stream()
                .collect(Collectors.averagingInt(Dish::getCal));

        System.out.println(avgCal);

        IntSummaryStatistics statistic = list.stream().collect(Collectors.summarizingInt(Dish::getCal));

        System.out.println(statistic);

        int sum2 = list.stream()
                .mapToInt(Dish::getCal).sum();

        System.out.println(sum2);

        Map<String, List<Dish>> group = list.stream()
                .collect(Collectors.groupingBy(Dish::getName));

        Map<String, List<Dish>> collect2 = list.stream().collect(Collectors.groupingBy(dish -> {
            if (dish.getCal() <= 400) {
                return "DIET";
            } else if (dish.getCal() <= 700) {
                return "NORMAL";
            } else {
                return "FAT";
            }
        }));

        System.out.println(collect2);

        Map<Type, List<Dish>> groupByType = list.stream()
                .filter(dish -> dish.getCal() > 500)
                .collect(Collectors.groupingBy(Dish::getType));

        System.out.println(groupByType);

        Map<Type, List<Dish>> groupByType2 = list.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.filtering(dish -> dish.getCal() > 500,
                                Collectors.toList())));

        System.out.println(groupByType2);

        Map<Type, Long> group2 = list.stream()
                .collect(Collectors.groupingBy(Dish::getType, Collectors.counting()));

        System.out.println(group2);

        Map<Type, Optional<Dish>> group3 = list.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.maxBy(Comparator.comparingInt(Dish::getCal))));

        System.out.println(group3);

        Map<Type, Dish> group4 = list.stream()
                .collect(Collectors.groupingBy(Dish::getType,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Dish::getCal)),
                                Optional::get)));

        System.out.println(group4);

        Optional<Integer> i = Optional.ofNullable(nullDish).map(Dish::getCal);
        System.out.println(i);

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
