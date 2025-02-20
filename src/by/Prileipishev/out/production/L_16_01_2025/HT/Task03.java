package by.Prileipishev.out.production.L_16_01_2025.HT;

import java.sql.SQLOutput;

/*
*
* Дан массив int. Найти индекс элемента который удовлетворяет условиям.
- Сам элемент не равен 0, и его соседние элементы тоже не равны 0.
- Элемент должен делиться без остатка на оба соседних элемента (т.е. на предыдущий и следующий).
Если такой элемент найден, вывести в консоль. Если таких элементов нет, вывести -1.
*
* */
public class Task03 {


    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 5};
        searchEl(arr);
    }

    private static void searchEl(int[] arr) {
        boolean flag = true;

        for (int i = 0; i < arr.length-1; i++) {
            if (i > 0 && arr[i] != 0) {
                if (arr[i - 1] != 0 && arr[i + 1] != 0) {
                    if (arr[i] % arr[i - 1] == 0 && arr[i] % arr[i + 1] == 0) {
                        System.out.println("Элемент найден: " + arr[i]);
                        flag = false;
                    }
                }
            }
        }

        if (flag == true) {
            System.out.println(-1);
        }

    }


}
