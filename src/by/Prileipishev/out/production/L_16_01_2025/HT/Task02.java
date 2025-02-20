package by.Prileipishev.out.production.L_16_01_2025.HT;

import java.util.Arrays;

/*
* 2. Задача вывести сколько раз встречается цифры в массиве.
* Например дан массив [1,1,2,2,2,3,4,5,5,5,5] в консоли выводим.
1 - 2 раза
2 - 3 раза
3 - 1 раз
4 - 1 раз
5 - 4 раза
*
* */

public class Task02 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 5};
        numCounter(arr);
    }

    private static void numCounter(int[] arr) {
        int size = uniqueArrSize(arr);
        int[] unique = uniqueArr(arr, size);

        for (int i = 0; i < unique.length; i++) {
            System.out.println(unique[i] + "-" + counter(arr, unique[i]) + " раза");
        }
    }

    private static int uniqueArrSize(int[] arr) {
        int[] unique = new int[arr.length];
        int size = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;

            for (int j = 0; j < unique.length; j++) {
                if (arr[i] == unique[j]) flag = true;
            }
            if (!flag) {
                unique[i] = arr[i];
                size++;
            }
        }
        return size;
    }

    private static int[] uniqueArr(int[] arr, int size) {
        int[] unique = new int[size];

        for (int i = 0, idx = 0; i < arr.length; i++) {
            boolean flag = false;

            for (int j = 0; j < unique.length; j++) {
                if (arr[i] == unique[j]) flag = true;
            }
            if (!flag) unique[idx++] = arr[i];
        }
        return unique;
    }

    private static int counter(int[] arr, int el) {
        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) c++;
        }
        return c;
    }

}
