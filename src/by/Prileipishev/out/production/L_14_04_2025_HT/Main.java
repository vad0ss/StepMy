package by.Prileipishev.out.production.L_14_04_2025_HT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {


    public static void main(String[] args) {
        List<String> listString = List.of("A java", "Home", "java Hello");
        List<Integer> listInteger = List.of(22, 22, 33, 42, 19, 22, 21);
        List<Integer> listInteger2 = new ArrayList<>();

        String[] strArr = {"A java Arr", "Home Arr", "java Hello Arr"};

        System.out.println(anyMatch(listString, (String str) -> str.charAt(0) == 'A'));
        System.out.println(allMatch(listInteger, (Integer num) -> num > 0));
        System.out.println(allMatch(listInteger, (Integer num) -> num > 18));
        System.out.println(findFirstMatch(listString, (String str) -> str.contains("java")));
        System.out.println(findFirstMatch(listString, (String str) -> str.length() > 5));

        System.out.println(getFirst(listString));
        System.out.println(min("apple", "banana"));
        printArray(strArr);
        System.out.println(counter(listInteger, 22));
        System.out.println(counter(listString, "Home"));
        System.out.println(contains(strArr, "Home Arr111"));

        List<String> lisStr = arrToList(strArr);
        System.out.println(lisStr);
        copyList(listInteger, listInteger2);
        System.out.println(listInteger2);

        System.out.println(getIndex(strArr, "java Hello Arr"));
        merge(listInteger2, listInteger2);
        System.out.println(listInteger2);
    }

    private static <T> boolean anyMatch(List<T> list, Predicate<T> predicate) {
        for (T t : list) {
            if (predicate.test(t)) {
                return true;
            }
        }
        return false;
    }

    private static <T> boolean allMatch(List<T> list, Predicate<T> predicate) {
        for (T t : list) {
            if (!predicate.test(t)) {
                return false;
            }
        }
        return true;
    }

    private static <T> List<T> findFirstMatch(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();

        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;
    }

    private static <T> Object getFirst(List<T> list) {
        return list.get(0);
    }

    private static <T extends Comparable<T>> T min(T o1, T o2) {
        return o1.compareTo(o2) <= 0 ? o1 : o2;
    }

    private static <T> void printArray(T[] arr) {
        for (T t : arr) {
            System.out.println(t);
        }
    }

    private static <T> Integer counter(List<T> list, T el) {
        Integer result = 0;

        for (T t : list) {
            if (t.equals(el)) {
                result++;
            }
        }

        return result;
    }

    private static <T> boolean contains(T[] arr, T obj) {
        for (T t : arr) {
            if (t.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    private static <T> List<T> arrToList(T[] arr) {
        List<T> list = new ArrayList<>();
        Collections.addAll(list, arr);
        return list;
    }

    private static <T> void copyList(List<T> a, List<T> b) {
        b.addAll(a);
    }

    private static <T> int getIndex(T[] arr, T obj) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(obj)) {
                return i;
            }
        }

        return -1;
    }

    private static <T> void merge(List<T> list, List<T> list2) {
        list.addAll(list2);
    }

}
