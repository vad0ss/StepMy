package by.Prileipishev.out.production.L_16_01_2025.HT;

public class Task02Freq {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4, 5, 5, 5, 5};
        numCounter(arr);
    }

    private static void numCounter(int[] arr) {
        int[] freq = new int[arr.length];

        for (int num : arr) {
            if (num >= 0 && num < arr.length) {
                freq[num]++;
            }
        }

        // Выводим результат
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " - " + freq[i] + " раза");
            }
        }
    }

}
