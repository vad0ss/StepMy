package by.Prileipishev.out.production.L_16_01_2025.HT;

import java.util.HashMap;
public class Task04HashMap {

    public static void main(String[] args) {
        int[] array = {1, 5, 7, -1, 5};
        int k = 6;
        HashMap map = countPairsWithSum(array, k);
        System.out.println("Количество пар: " + map.size());
    }

    public static HashMap countPairsWithSum(int[] array, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : array) {
            // Проверяем, есть ли пара, дополняющая num до k
            int complement = k - num;
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement);
            }

            // Увеличиваем счетчик для текущего элемента в частотной карте
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println(freqMap);

        return freqMap;
    }

}
