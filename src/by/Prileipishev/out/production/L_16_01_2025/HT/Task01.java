package by.Prileipishev.out.production.L_16_01_2025.HT;

/*
 *
 * Определить все ли элементы в массиве одинаковые. В консоль написать Да элементы в массиве одинаковые или Нет элементы в массиве разные.
 *
 * */

import L_16_01_2025.utils.ArrayUtil;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Task01 {

    public static void main(String[] args) {
        int[] arr = ArrayUtil.generateIntArray(10, 1, 2);
        boolean isIdent = isIdenticalFromSet(arr);

        System.out.println(Arrays.toString(arr));

        if (isIdent == true) {
            System.out.println("Элементы одинаковые");
        } else {
            System.out.println("Элементы разные");
        }
    }

    private static boolean isIdentical(int[] arr) {
        boolean res = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                res = false;
                break;
            }
        }
        return res;
    }

    private static boolean isIdenticalFromSet(int[] arr) {
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        return set.size() == 1 ? true : false;
    }

}
