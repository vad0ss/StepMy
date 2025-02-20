package by.Prileipishev.out.production.L_16_01_2025.HT;

import java.util.*;
import java.util.stream.Collectors;
/*
* /*
* 2. Задача вывести сколько раз встречается цифры в массиве.
* Например дан массив [1,1,2,2,2,3,4,5,5,5,5] в консоли выводим.
1 - 2 раза
2 - 3 раза
3 - 1 раз
4 - 1 раз
5 - 4 раза
*
* */

public class Task02Map {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 5};
        numCounter(arr);
    }

    private static void numCounter(int[] arr) {
        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        for (int val : set) {
            int counter = 0;

            for (int i = 0; i < arr.length; i++) {
                if (val == arr[i]) {
                    counter++;
                }
            }

            map.put(val, counter);

        }

        map.forEach((k, v) -> System.out.println(k + " - " + v + " раза"));

    }

}
