package by.Prileipishev.out.production.L_20_01_2025;

import by.Prileipishev.out.production.L_16_01_2025.utils.ArrayUtil;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
        int[] arr = ArrayUtil.generateIntArray(100, 0, 100);

        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }


    public static void bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j]; //
                    arr[j] = temp;
                }
            }
        }

    }


}
