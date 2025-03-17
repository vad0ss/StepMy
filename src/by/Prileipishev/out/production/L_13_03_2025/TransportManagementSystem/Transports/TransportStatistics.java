package by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports;

import by.Prileipishev.out.production.L_13_03_2025.TransportManagementSystem.Transports.Interfaces.TransportInterface;

import java.util.HashMap;
import java.util.Map;

public class TransportStatistics implements TransportInterface {

    private Map<String, Integer> brandCount = new HashMap<>();

    @Override
    public void addTransport(Transport transport) {
        int currentCount = getBrandCount(transport.getModel());
        brandCount.put(transport.getModel(), ++currentCount);
    }


    public int getBrandCount(String brand) {
        return brandCount.get(brand) != null ? brandCount.get(brand) : 0;
    }

    public void printBrandStatistics() {
        System.out.println(brandCount);
    }

}
