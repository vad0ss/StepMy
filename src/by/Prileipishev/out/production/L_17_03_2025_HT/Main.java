package by.Prileipishev.out.production.L_17_03_2025_HT;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Алексей", "Мария", "Алексей", "Дмитрий", "Мария", "Семён", "Семён", "Андрей"));
        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);
        List<String> words = List.of("кот", "собака", "кот", "птица", "рыба", "рыба");
        List<String> wordsToSort = new ArrayList<>(List.of("яблоко", "ананас", "киви", "банан"));
        Set<String> set1 = Set.of("Алексей", "Мария", "Дмитрий");
        Set<String> set2 = Set.of("Мария", "Сергей", "Алексей");
        Set<String> set3 = Set.of("Мария", "Сергей");

        System.out.println(removeDuplicates(names));
        System.out.println(uniqIntegerList(numbers));
        System.out.println(hasDuplicates(names));
        System.out.println(commonElements(set1, set2));
        System.out.println(twoSetDiff(set1, set3));
        System.out.println(uniqueStringFromListSize(words));
        System.out.println(listStringSizeSort(wordsToSort));
        System.out.println(firstUniqueWord(words));
        System.out.println(evenOddSeparator(numbers));
    }

    public static List<String> removeDuplicates(List<String> list) {
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static List<Integer> uniqIntegerList(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

    public static boolean hasDuplicates(List<String> list) {
        Set<String> set = new HashSet<>(list);
        return list.size() != set.size();
    }

    public static Set<String> commonElements(Set<String> set1, Set<String> set2) {
        Set<String> set = new HashSet<>();
        for (String s : set1) {
            if (set2.contains(s)) {
                set.add(s);
            }
        }
        return set;
    }

    public static Set<String> twoSetDiff(Set<String> set1, Set<String> set2) {
        Set<String> set = new HashSet<>();
        for (String s : set1) {
            if (!set2.contains(s)) {
                set.add(s);
            }
        }
        return set;
    }

    public static int uniqueStringFromListSize(List<String> list) {
        Set<String> set = new HashSet<>(list);
        return set.size();
    }

    public static List<String> listStringSizeSort(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.length() - s2.length();
            }
        });
        return list;
    }

    public static String firstUniqueWord(List<String> list) {
        for (String s : list) {
            int count = Collections.frequency(list, s);
            if(count == 1) return s;
        }
        return list.get(0);
    }

    public static List<ArrayList<Integer>> evenOddSeparator(List<Integer> list) {
        List<ArrayList<Integer>> res = List.of(new ArrayList<>(), new ArrayList<>());
        List<Integer> even = res.get(0);
        List<Integer> odd = res.get(1);

        for (Integer num : list) {
            boolean b = num % 2 == 0 ? even.add(num) : odd.add(num);
        }
        return res;
    }

}
