package by.Prileipishev.out.production.L_20_01_2025;

import L_16_01_2025.utils.ArrayUtil;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Task02 {

    // 375298682497

    public static void main(String[] args) {
        long[] arr = ArrayUtil.generateDoubleArray(10000000, 375290000000L, 375300000000L);

        long myPhone = 375298682497L;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index = Arrays.binarySearch(arr, myPhone);

        System.out.println(index > 0 ? "Телефон найден " + index + " " + arr[index] : "Не найден");

    }


}
