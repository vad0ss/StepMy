package by.Prileipishev.out.production.L_20_01_2025;

import L_16_01_2025.utils.ArrayUtil;

import java.util.Arrays;

public class Task01 {


    public static void main(String[] args) {
        sort();
        search();
        fill();
    }


    public static void fill() {
        int[] arr = new int[50];
        Arrays.fill(arr,8);
        System.out.println(Arrays.toString(arr));
    }

    public static void search() {
        int[] arr = ArrayUtil.generateIntArray(20,0,20);
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index > 0 ? "Найден элемент по индексу : " + index : "Не найден");
    }

    public static void sort() {
        int[] arr = ArrayUtil.generateIntArray(20,0,20);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
