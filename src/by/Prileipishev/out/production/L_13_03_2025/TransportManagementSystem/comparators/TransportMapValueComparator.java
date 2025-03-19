package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.comparators;

import java.util.Comparator;
import java.util.Map;

public class TransportMapValueComparator implements Comparator<String> {
    private final Map<String, Integer> map;

    public TransportMapValueComparator(Map<String, Integer> map) {
        this.map = map;
    }

    @Override
    public int compare(String k1, String k2) {
        return map.get(k2).compareTo(map.get(k1));
    }

}
