package by.Prileipishev.out.production.L_06_03_2025.Transport;

import java.util.*;

public class TransportManager {

    private List<Transport> transportList = new ArrayList<>();
    private Set<Transport> uniqueTransportSet = new HashSet<>();

    private TransportManager() {}

    public void addTransport(Transport transport) {
        transportList.add(transport);
        uniqueTransportSet.add(transport);
    }

    public removeTransport(String model) {
        Iterator<Transport> listIterator = this.transportList.iterator();

        while (listIterator.hasNext()) {
            Transport next = listIterator.next();

            if (next.getModel().equals(model)) {
                listIterator.remove();
            }
        }



    }





}
