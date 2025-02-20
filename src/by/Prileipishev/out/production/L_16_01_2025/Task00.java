package by.Prileipishev.out.production.L_16_01_2025;

import by.Prileipishev.out.production.L_16_01_2025.utils.ArrayUtil;

import java.util.Arrays;

public class Task00 {

    public static void main(String[] args) {
        //deleteNumFromArray();
        isPalindrom();
        numOfPairs();
    }

    private static void deleteNumFromArray() {
        int[] intArray = ArrayUtil.generateIntArray(10, 10, 60);
        int deleteIndex = 2;
        int[] result = new int[intArray.length - 1];
        System.out.println(Arrays.toString(intArray));

        if (deleteIndex >= 0 && deleteIndex < intArray.length) {
            for (int i = 0, j = 0; i < intArray.length; i++) {
                if (i != deleteIndex) {
                    result[j++] = intArray[i];
                }
            }
        } else {
            System.out.println("Index not array");
        }

        System.out.println(Arrays.toString(result));

    }

    private static void isPalindrom() {
        int[] palindrom = {1, 2, 3, 4, 3, 2, 1};
        String answer = "Palindrom";

        for (int i = 0, j = palindrom.length - 1; i < palindrom.length / 2; i++, j--) {
            if (palindrom[i] != palindrom[j]) {
                answer = "Not Palindrom";

            }
        }
        System.out.println(answer);
    }

    /*
     * Подсчитать количество пар с заданной суммой. Условие: Найдите количество пар в массиве, сумма которых равна заданному числу k.
     * Пример: Массив [1,5,7,-1,5] k = 6 Вывод: 3 пары (1,5) (7, -1) (5, 1)   *
     *
     * */

    private static void numOfPairs() {
        int[] arr = {1, 5, 7, -1, 5};
        int pairsSum = 0;
        int k = 6;

//        for (int i = 0, j = 1; i < arr.length; i++, j++) {
//             if(i < arr.length - 1 && arr[i] + arr[j] == k) {
//                 pairsSum++;
//             } else if(i == arr.length - 1 && arr[i] + arr[0] == k) {
//                 pairsSum++;
//            }
//        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] + arr[j] == k) {
                    pairsSum++;
                    break;
                }
            }
        }

        System.out.println(pairsSum);

    }


}
