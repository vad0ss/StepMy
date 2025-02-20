package by.Prileipishev.out.production.L_16_01_2025.HT;


/*
* 4. Подсчитать количество пар с заданной суммой
Условие: Найдите количество пар в массиве, сумма которых равна заданному числу k.
Пример:
Ввод: Массив [1, 5, 7, -1, 5], k = 6
Вывод: 3 пары: (1, 5), (7, -1), (5, 1)
*
* */
public class Task04 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        numOfPairs(arr, 6);
    }

    private static void numOfPairs(int[] arr, int k) {
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.print("(" + arr[i] + "," + arr[j] + "), ");
                    counter++;
                }
            }
        }
        System.out.println(counter + " пары");
    }

}
