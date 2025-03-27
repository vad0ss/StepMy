package by.Prileipishev.out.production.L_27_03_2025;

import java.util.List;

public class Task00 {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();

        stringBox.setItem("Привет");
        String item = stringBox.getItem();
        System.out.println(item);
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(12);
        Integer item1 = integerBox.getItem();
        System.out.println(item1);

        printTwice(item);
        printTwice(item1);

        Pair<String, Integer> student = new Pair<>("Дима", 18);
        System.out.println(student.getKey());
        System.out.println(student.getValue());
        List<Integer> integers = List.of(1, 2, 3);
        printList(integerBox);

        List<String> strings = List.of("1", "2", "3");
    }

    public static <T> T printTwice(T value) {
        System.out.println(value);
        System.out.println(value);
        return value;
    }

    public static void printList(Box<? extends Number> list) {

    }

//    public static <T, U> List<?> <T[], U> void test(T value, U item) {
//
//    }

}
