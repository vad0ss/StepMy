package by.Prileipishev.out.production.L_20_01_2025;

import L_16_01_2025.utils.ArrayUtil;

import java.util.Arrays;


public class Task00 {

    public static void main(String[] args) {
        int[] array = new int[20]; // array create
        ArrayUtil.generateIntArray(array, 0, 20);
        System.out.println("Array := " + Arrays.toString(array));

        int x = 1;
        int y = 2;
        function1(x,y);
        System.out.println(x + " " + y);
        Arrays.sort(array);
        System.out.println("Search Element : = ");
    }

    public static void function1(int a, int b) {
        a = 10;
        b = 20;
    }

}
