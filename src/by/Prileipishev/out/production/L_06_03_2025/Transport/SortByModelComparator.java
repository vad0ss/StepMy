package by.Prileipishev.out.production.L_06_03_2025.Transport;

import java.util.Comparator;

public class SortByModelComparator implements Comparator<Transport> {
    @Override
    public int compare(Transport transport, Transport t1) {
        return transport.getModel().compareTo(t1.getModel());
    }
}
