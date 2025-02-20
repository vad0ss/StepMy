package by.Prileipishev.out.production.L_16_01_2025.utils;

import java.util.Random;

public class ArrayUtil {

    private final static Random random = new Random();

    public static int[] generateIntArray(int size, int numberOrigin, int numberBound) {
        return random.ints(size, numberOrigin, numberBound).toArray();
    }

    public static void generateIntArray(int[] originArray, int numberOrigin, int numberBound) {
        int[] array = random.ints(originArray.length, numberOrigin, numberBound).toArray();
        System.arraycopy(array, 0, originArray, 0, originArray.length);
    }

    public static long[] generateDoubleArray(int size, long numberOrigin, long numberBound) {
        return random.longs(size, numberOrigin, numberBound).toArray();
    }

}
