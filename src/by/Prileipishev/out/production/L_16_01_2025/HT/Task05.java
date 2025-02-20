package by.Prileipishev.out.production.L_16_01_2025.HT;

/*
* 5. Проверить, есть ли в массиве числа, дающие в сумме заданное значение
Условие: Проверьте, существуют ли в массиве два числа, сумма которых равна k.
Пример:
Ввод: Массив [10, 15, 3, 7], k = 17
Вывод: Да (10 + 7)
*
* */

public class Task05 {


    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        sumCounter(arr, 17);
    }

    private static void sumCounter(int[] arr, int k) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (j != i && arr[i] + arr[j] == k) {
                    System.out.println("Да " + "(" + arr[i] + " + " + arr[j] + ")");
                }
            }
        }

    }

}
